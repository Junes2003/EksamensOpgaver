package Øvelser.Spørgsmål1_17.Spørgsmål5;

import Øvelser.Spørgsmål1_17.Spørgsmål5.Song;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<Song> songs;

    public PlayList() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public int getTotalDuration() {
        int total = 0;
        for (Song song : songs) {
            total += song.getSongDuration();
        }
        return total;
    }

    public List<Song> getSongFromMusician(String musician) {
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getMusician().equalsIgnoreCase(musician)) {
                result.add(song);
            }
        }
        return result;
    }

    public void printSongs() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}