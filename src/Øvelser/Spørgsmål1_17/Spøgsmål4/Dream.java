package Øvelser.Spørgsmål1_17.Spøgsmål4;

import java.time.LocalDate;

public class Dream {
    private LocalDate date;
    private int duration;
    private String type;

    public Dream(int duration, String type) {
        this.date = LocalDate.now();
        this.duration = duration;
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isPleasant() {
        if (duration < 10 || duration > 10) {
            return true;

        } else {
            return false;
        }

    }

    public String getType(){
        return type;
    }
    @Override
    public String toString(){
        return "Dream:" + "Date:" + date + "\n"  +
                "Duration" + duration + "\n" +
                "Type" + type;
    }
}
