package com.company.model.service;

import com.company.model.Movies;

import java.util.List;
import java.util.Scanner;

public class FindByMap implements FindAble {

   static Scanner scanner = new Scanner(System.in);
    @Override
    public void findMoviesByActor(List<Movies> movies) {
        System.out.println("Актёрдун аты: ");
        String actorName = scanner.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getCast().getActor().equals(actorName)) {
                System.out.println("Аты: " + movies.get(i).getName());
                System.out.println("Жылы: " + movies.get(i).getYear());
                System.out.println("Description: " + movies.get(i).getDescription());
                System.out.println("Режиссёр: " + movies.get(i).getDirector());
                System.out.println("* Ролдордо " + movies.get(i).getName() + " *\n"
                        + "Актёр: " + movies.get(i).getCast().getActor());
                System.out.println("Роль: " + movies.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void findMoviesByDirector(List<Movies> movies) {
        System.out.println("Режиссёрдун аты: ");
        String director = scanner.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getDirector().getActor().equals(director)) {
                System.out.println("Режиссёр: " + movies.get(i).getDirector());
                System.out.println("Аты: " + movies.get(i).getName());
                System.out.println("Жылы: " + movies.get(i).getYear());
                System.out.println("Description: " + movies.get(i).getDescription());
                System.out.println("* Ролдордо " + movies.get(i).getName() + " *\n"
                        + "Актёр: " + movies.get(i).getCast().getActor());
                System.out.println("Роль: " + movies.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void findMoviesByYear(List<Movies> moviesYear) {
        System.out.println("Жылы: ");
        int year = scanner.nextInt();
        for (int i = 0; i < moviesYear.size(); i++) {
            if (moviesYear.get(i).getYear() == year) {
                System.out.println("Жыл: " + moviesYear.get(i).getYear());
                System.out.println("Режиссер: " + moviesYear.get(i).getDirector());
                System.out.println("Аты: " + moviesYear.get(i).getName());
                System.out.println("Description: " + moviesYear.get(i).getDescription());
                System.out.println("* Ролдордо: " + moviesYear.get(i).getName() + " *\n"
                        + "Актер: " + moviesYear.get(i).getCast().getActor());
                System.out.println("Роль: " + moviesYear.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies) {
        System.out.println("Актёрдун аты: ");
        String name = scanner.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getCast().getActor().equals(name)) {
                System.out.println("---------------------------------------------------");
                System.out.println("              Актёр: " + movies.get(i).getCast().getActor());
                System.out.println("---------------------------------------------------");
                System.out.println("Фильм: " + movies.get(i).getName());
                System.out.println("Роль: " + movies.get(i).getCast().getRole());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void showActorRoles(List<Movies> movies) {
        movies.sort(Movies.sortByActor);
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("Актёр: " + movies.get(i).getCast().getActor());
            System.out.println("Роль: " + movies.get(i).getCast().getRole());
            System.out.println("Фильм: " + movies.get(i).getName());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    }

