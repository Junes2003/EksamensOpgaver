package Øvelser.Spørgsmål1_17.Spørgsmål5;

public class Song {
    private String name;
    private String musician;
    private int songDuration;

    public Song(String name, String musician, int songDuration) {
        this.name = name;
        this.musician = musician;
        this.songDuration = songDuration;
    }

    public String getName() {
        return name;
    }

    public String getMusician() {
        return musician;
    }

    public int getSongDuration() {
        return songDuration;
    }

    @Override
    public String toString() {
        return name + " af " + musician + " (" + songDuration + " sek)";
    }
}