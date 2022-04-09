package com.company.model.service;

import com.company.model.Movies;

import java.util.List;
import java.util.Scanner;

public class MovieStory implements SortAble {
    static Scanner scanner = new Scanner(System.in);


    @Override
    public void printAllMovies(List<Movies> movies) {
        System.out.println("~~~~~~~~~~~~~~~~~~ * Баардык фильмдер * ~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("Аты: " + movies.get(i).getName());
            System.out.println("Жылы: " + movies.get(i).getYear());
            System.out.println("Description: " + movies.get(i).getDescription());
            System.out.println("Режиссёр: " + movies.get(i).getDirector());
            System.out.println("* Ролдордо " + movies.get(i).getName() + " *\n" +
                    "Актёр: " + movies.get(i).getCast().getActor());
            System.out.println("Роль: " + movies.get(i).getCast().getRole());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    @Override
    public void findMovie(List<Movies> moviesName) {
        System.out.println("Фильмдин аты: ");
        String name = scanner.nextLine();
        for (int i = 0; i < moviesName.size(); i++) {
            if (moviesName.get(i).getName().equals(name)) {
                System.out.println("Аты: " + moviesName.get(i).getName());
                System.out.println("Жылы: " + moviesName.get(i).getYear());
                System.out.println("Description: " + moviesName.get(i).getDescription());
                System.out.println("Режиссёр: " + moviesName.get(i).getDirector());
                System.out.println("* Ролдордо " + moviesName.get(i).getName() + " *\n" +
                        "Актёр: " + moviesName.get(i).getCast().getActor());
                System.out.println("Роль: " + moviesName.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void sortByYear(List<Movies> movieYear) {
        System.out.println("Осуу тартибинде сорттоо учун 1ди басыныз");
        System.out.println("Кемуу тартибинде сорттоо учун 2ни басыныз");
        int choice = scanner.nextInt();
        if(choice==1) {
            movieYear.sort(Movies.moviesComparator);
            for (int i = 0; i < movieYear.size(); i++) {
                System.out.println("Жылы: " + movieYear.get(i).getYear());
                System.out.println("Аты: " + movieYear.get(i).getName());
                System.out.println("Description: " + movieYear.get(i).getDescription());
                System.out.println("Режиссёр: " + movieYear.get(i).getDirector());
                System.out.println("* Ролдордо " + movieYear.get(i).getName() + " *\n" +
                        "Актёр: " + movieYear.get(i).getCast().getActor());
                System.out.println("Роль: " + movieYear.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }else if(choice==2){
            movieYear.sort(Movies.moviesComparatorDesc);
            for (int i = 0; i < movieYear.size(); i++) {
                System.out.println("Жылы: " + movieYear.get(i).getYear());
                System.out.println("Аты: " + movieYear.get(i).getName());
                System.out.println("Description: " + movieYear.get(i).getDescription());
                System.out.println("Режиссёр: " + movieYear.get(i).getDirector());
                System.out.println("* Ролдордо " + movieYear.get(i).getName() + " *\n" +
                        "Актёр: " + movieYear.get(i).getCast().getActor());
                System.out.println("Роль: " + movieYear.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }else {
            System.out.println("Enter басыныз");
        }
    }

    @Override
    public void sortByName(List<Movies> movies) {
        movies.sort(Movies.sortByName);
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("Аты: " + movies.get(i).getName());
            System.out.println("Жылы" + movies.get(i).getYear());
            System.out.println("Description: " + movies.get(i).getDescription());
            System.out.println("Режиссёр: " + movies.get(i).getDirector());
            System.out.println("* Ролдордо " + movies.get(i).getName() + " *\n" +
                    "Актёр: " + movies.get(i).getCast().getActor());
            System.out.println("Роль: " + movies.get(i).getCast().getRole());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    @Override
    public void sortByDirector(List<Movies> movies) {
        movies.sort(Movies.sortByDirector);
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("Режиссёр: " + movies.get(i).getDirector());
            System.out.println("Аты: " + movies.get(i).getName());
            System.out.println("Жылы" + movies.get(i).getYear());
            System.out.println("Description: " + movies.get(i).getDescription());
            System.out.println("* Ролдордо " + movies.get(i).getName() + " *\n" +
                    "Актёр: " + movies.get(i).getCast().getActor());
            System.out.println("Роль: " + movies.get(i).getCast().getRole());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
