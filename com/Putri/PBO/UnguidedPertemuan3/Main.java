package com.Putri.PBO.UnguidedPertemuan3;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist("My Playlist");

        Song song1 = new Song("Champed", "Rini", 341);
        myPlaylist.addSong(song1);

        Podcast podcast1 = new Podcast("PODKESMAS", "Podkesmas Asia", 3600);
        myPlaylist.addSong(podcast1);

        Song song2 = new Song("Kill Bill", "SZA", 240);
        myPlaylist.addSong(song2);

        List<Song> songs = myPlaylist.getSongs();
        for (Song song : songs) {
            if (song instanceof Podcast) {
                System.out.println("Podcast:");
                System.out.println("Title: " + song.getTitle());
                System.out.println("Speaker: " + ((Podcast) song).getSpeaker());
                System.out.println("Duration: " + song.getDuration());
            } else {
                System.out.println("Song:");
                System.out.println("Title: " + song.getTitle());
                System.out.println("Artist: " + song.getArtist());
                System.out.println("Duration: " + song.getDuration());
            }
        }
    }
}