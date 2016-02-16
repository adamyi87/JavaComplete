package com.projekt2501;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holyman", 4.3);
        album.addSong("Hold on", 4.1);
        album.addSong("Lady double dealer", 4.6);

        albums.add(album);



        album = new Album("Thriller", "Michael Jackson");
        album.addSong("Wanna be startin something", 4.32); // Track no.1 -> index: 0
        album.addSong("Baby be mine", 3.44);               // Track no.2 -> index: 1
        album.addSong("Thriller", 5.43);                   // Track no.3 -> index: 2
        album.addSong("Beat it", 4.44);                    // Track no.4 -> index: 3
        album.addSong("Billie Jean", 3.54);                // Track no.5 -> index: 4

        albums.add(album);

        //Playlist has 5 songs, up to 4 elements
        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Stormbringer", playList);
        albums.get(0).addToPlayList("Holyman", playList);
        albums.get(1).addToPlayList("Thriller", playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(5, playList);

        play(playList);


        //================================================ My own version =========================
        ArrayList<Song> playList2 = new ArrayList<Song>();
        albums.get(1).addToPlayList("Wanna be startin something", playList2);
        albums.get(1).addToPlayList("Thriller", playList2);
        albums.get(1).addToPlayList("Beat it", playList2);
        albums.get(1).addToPlayList("bille jean", playList2);

        //playFromOnline(playList2);

    }

    private static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("The playlist is empty.");
        }
        else{
            System.out.println("Playing: " + listIterator.next().toString());
        }
    }











    //ARRAYLIST EXAMPLE
//    private static void playFromOnline(ArrayList<Song> playList2){
//        if(playList2.size() == 0){
//            System.out.println("The playlist is empty.");
//        }
//        else{
//            for(int i=0; i<playList2.size(); i++){
//                Song eachSong = playList2.get(i);
//                System.out.println("Playing: " + eachSong.getTitle() + "---" + eachSong.getDuration());
//            }
//        }
//    }


}
