package Øvelser.Spørgsmål1_17.Spørgsmål7;

import Øvelser.Spørgsmål1_17.Spørgsmål7.MeetingType;

import java.time.LocalDate;

public class Meeting implements Comparable<Meeting> {
    private LocalDate date;
    private int duration;
    private MeetingType type;

    public Meeting(LocalDate date, int duration, MeetingType type) {
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public int compareTo(Meeting other) {
        return this.date.compareTo(other.date);
    }

    @Override
    public String toString() {
        return date + " | " + duration + " min | " + type;
    }
}