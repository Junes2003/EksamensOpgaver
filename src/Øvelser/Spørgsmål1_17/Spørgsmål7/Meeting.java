package Øvelser.Spørgsmål1_17.Spørgsmål7;

import java.time.LocalDate;

public class Meeting {
    private LocalDate date;
    private int duration;
    private MeetingType type;

    public Meeting(LocalDate date, int duration, MeetingType type){
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public LocalDate getDate(){
        return date;
    }

    public int getDuration(){
        return duration;
    }

    public String getType(){
        return getType();
    }

    public boolean externalParticipant(){
        switch (type){
            case KONFLIKTLØSENDE:
                return true;
            case OPSTARTSMØDE:
                return duration > 60;
            case PLANLÆGNINGSMØDE:
                return duration > 120;
            default:
                return false;
        }
    }

    @Override
    public String toString(){
        return "Meeting" +
                "Date: " + date + "\n" +
                "Duration: " + duration + "\n" +
                "Type: " + type;
    }

}
