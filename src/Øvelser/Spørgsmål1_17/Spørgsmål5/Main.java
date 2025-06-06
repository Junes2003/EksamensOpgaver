package Øvelser.Spørgsmål1_17.Spørgsmål5;

public class Main {
    public static void main(String[] args) {
        PlayList playlist = new PlayList();

        playlist.addSong(new Song("Imagine", "John Lennon", 183));
        playlist.addSong(new Song("Let It Be", "The Beatles", 240));
        playlist.addSong(new Song("Hey Jude", "The Beatles", 431));
        playlist.addSong(new Song("Hallelujah", "Leonard Cohen", 297));

        System.out.println("Alle sange:");
        playlist.printSongs();

        System.out.println("\nTotal varighed: " + playlist.getTotalDuration() + " sekunder");

        System.out.println("\nSange fra The Beatles:");
        for (Song song : playlist.getSongFromMusician("The Beatles")) {
            System.out.println(song);
        }
    }
}