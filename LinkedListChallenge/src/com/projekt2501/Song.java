package com.projekt2501;

/**
 * Created by ay-sam on 2/15/16.
 */
public class Song {
    private String title;
    private double duration;
    //GETTERS
    public String getTitle(){
        return this.title;
    }
    public double getDuration(){
        return this.duration;
    }

    public String toString(){
        return this.title + ": " + this.duration;
    }

    //CONSTRUCTOR
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
}
