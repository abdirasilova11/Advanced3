package com.company;

import com.company.model.Cast;
import com.company.model.Director;
import com.company.model.Movies;
import com.company.model.service.FindAble;
import com.company.model.service.FindByMap;
import com.company.model.service.MovieStory;
import com.company.model.service.SortAble;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Movies> movies = new ArrayList<>();
    private static final SortAble s = (SortAble) new MovieStory();
    private static final FindAble f = (FindAble) new FindByMap();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String data = null;
        try {
            data = new String(Files.readAllBytes(Path.of("movies.json")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject object = new JSONObject(data);
        JSONArray array = object.getJSONArray("movies");
        for (int i = 0; i < array.length(); i++) {
            JSONObject movieIndexes = array.getJSONObject(i);
            Movies movie = new Movies();
            movie.setName(movieIndexes.getString("name"));
            movie.setYear(movieIndexes.getInt("year"));
            movie.setDescription(movieIndexes.getString("description"));
            JSONObject directorInfo = movieIndexes.getJSONObject("director");
            Director director = new Director();
            director.setActor(directorInfo.getString("actor"));
            movie.setDirector(director);
            JSONArray castsArr = movieIndexes.getJSONArray("cast");
            for (int j = 0; j < castsArr.length(); j++) {
                JSONObject castObjest = castsArr.getJSONObject(j);
                Cast cast = new Cast();
                cast.setActor(castObjest.getString("actor"));
                cast.setRole(castObjest.getString("role"));
                movie.setCast(cast);
            }
            movies.add(movie);
        }
        while (true) {
            commands();
            start();
        }
    }

    static void commands() {
        System.out.println("===================== Команды ====================");
        System.out.println("Каталогду коруу учун 1ди басыныз");
        System.out.println("Фильмдин атын коруу учун 2ни басыныз");
        System.out.println("Жылы боюнча сорттоо учун 3ту басыныз");
        System.out.println("Аты боюнча сорттоо учун 4ту басыныз");
        System.out.println("Описание боюнча сорттоо учун 5ти басыныз");
        System.out.println("Актёр боюнча сорттоо учун 6ны басыныз");
        System.out.println("Режиссёр боюнча сорттоо учун 7ни басыныз");
        System.out.println("Фильмдин атын коруу учун 8ди басыныз");
        System.out.println("Баардык фильмдер жана актёрлорду коруу учун 9");
        System.out.println("Актёрлор жана алардын ролдору боюнча сорттоо учун 10 ");
        System.out.println("====================================================");
    }

    public static void start() {
        String command = in.nextLine();
        switch (command) {
            case "1":
                s.printAllMovies(movies);
                break;
            case "2":
                s.findMovie(movies);
                break;
            case "3":
                s.sortByYear(movies);
                break;
            case "4":
                s.sortByName(movies);
                break;
            case "5":
                s.sortByDirector(movies);
                break;
            case "6":
                f.findMoviesByActor(movies);
                break;
            case "7":
                f.findMoviesByDirector(movies);
                break;
            case "8":
                f.findMoviesByYear(movies);
                break;
            case "9":
                f.findMoviesAndRoleByActor(movies);
                break;
            case "10":
                f.showActorRoles(movies);
                break;
            default:
                System.err.println("Туура эмес номер! Сураныч, туура номерди корсотунуз!");
                break;
        }
    }
}
