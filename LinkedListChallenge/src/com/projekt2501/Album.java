package com.projekt2501;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by ay-sam on 2/15/16.
 */
public class Album {
    private String albumName;
    private String artistName;
    private ArrayList<Song> songs;

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    //CONSTRUCTOR
    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songs = new ArrayList<Song>();
    }

    //METHODS
    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        else{
            return false;
        }
    }
    public boolean addToPlayList(int trackNo, LinkedList<Song> playList){
        int index = trackNo - 1;
        if((index > 0) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNo);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song foundSong = findSong(title);
        if(foundSong != null){
            playList.add(foundSong);
            return true;
        }
        else{
            System.out.println("The song: "+ title + " is not in the album.");
            return false;
        }
    }






    //MY OWN VERSION OF ADDTOPLAYLIST USING ARRAYLIST INSTEAD.==============
    public boolean addToPlayList(String title, ArrayList<Song> playList){
        Song foundSong = findSong(title);
        if(foundSong != null){
            playList.add(foundSong);
            return true;
        }
        return false;
    }



    //MY OWN VERSION OF ADDTOPLAYLIST USING ARRAYLIST INSTEAD.==============








    //PRIVATE
    // Another alternative way of finding a song is using Foreach method.
    private Song findSong(String title){
        for(Song foundSong: this.songs){
            if(foundSong.getTitle().equalsIgnoreCase(title)){
                return foundSong;
            }
        }
        return null;
    }

















    //============================ MY OWN VERSION ================
//    private Song searchSong(String title){
//        for(int i=0; i<songs.size(); i++){
//            Song foundSong = songs.get(i);
//            if(foundSong.getTitle().equalsIgnoreCase(title)){
//                return foundSong;
//            }
//        }
//        return null;
//    }
    //============================ MY OWN VERSION ================
}
