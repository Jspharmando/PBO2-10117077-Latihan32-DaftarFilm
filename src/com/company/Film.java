package com.company;

/**
 *
 * @author Joseph Armando Carvallo
 */

public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRanting;
    public int filmDuration;

    public void nowPlaying(String nowFilmName, String nowFilmGenre, double nowFilmRanting, int nowFilmDuration){
        System.out.println("Judul Film\t\t:"+nowFilmName);
        System.out.println("Genre Film\t\t:"+nowFilmGenre);
        System.out.println("Ranting Film\t:"+nowFilmRanting);
        System.out.println("Duration Film\t:"+nowFilmDuration+" Menit");
        System.out.println("");
    }
}
