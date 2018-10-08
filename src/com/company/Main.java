package com.company;

/**
 *
 * @author Joseph Armando Carvallo
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("===Daftar Film Yang Sedang Tayang==");
        System.out.println("");
        Film film1 = new Film();
            film1.filmName = "Venom";
            film1.filmGenre = "Action, Horror, Sci-Fi";
            film1.filmRanting = 8.5;
            film1.filmDuration = 120;
        film1.nowPlaying(film1.filmName, film1.filmGenre, film1.filmRanting, film1.filmDuration);

        Film film2 = new Film();
            film2.filmName = "Small Foot";
            film2.filmGenre = "Animation";
            film2.filmRanting = 9.0;
            film2.filmDuration = 96;
        film1.nowPlaying(film2.filmName, film2.filmGenre, film2.filmRanting, film2.filmDuration);

        Film film3 = new Film();
            film3.filmName = "Crazy Rich Asian";
            film3.filmGenre = "Comedy";
            film3.filmRanting = 7.8;
            film3.filmDuration = 119;
        film1.nowPlaying(film3.filmName, film3.filmGenre, film3.filmRanting, film3.filmDuration);

        Film film4 = new Film();
        film4.filmName = "Asih";
        film4.filmGenre = "Horror";
        film4.filmRanting = 6.0;
        film4.filmDuration = 100;
        film1.nowPlaying(film4.filmName, film4.filmGenre, film4.filmRanting, film4.filmDuration);
    }
}
