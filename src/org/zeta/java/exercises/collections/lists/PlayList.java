package org.zeta.java.exercises.collections.lists;

import java.util.LinkedList;

public class PlayList {
    private static LinkedList<String> playlist;

    public static void addSongAtTheBeginning(String song) {
        playlist.addFirst(song);
    }

    public static void addSongAtTheLast(String song) {
        playlist.addLast(song);
    }

    public static void remove(String song) {
        playlist.remove(song);
    }

    public static void main(String[] args) {
        playlist = new LinkedList<>();
        String[] songs = {"Magic Shop", "Butter", "Dynamite", "Permission To Dance", "Take Two", "Spring Day"};
        addSongAtTheBeginning(songs[0]);
        System.out.println(playlist);
        addSongAtTheBeginning(songs[2]);
        System.out.println(playlist);
        addSongAtTheLast(songs[1]);
        System.out.println(playlist);
        addSongAtTheBeginning(songs[4]);
        System.out.println(playlist);
        addSongAtTheLast(songs[3]);
        System.out.println(playlist);
        remove("Dynamite");
        System.out.println(playlist);
    }
}
