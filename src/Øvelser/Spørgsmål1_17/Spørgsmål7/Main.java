package Øvelser.Spørgsmål1_17.Spørgsmål7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Meeting> meetings = new ArrayList<>();
        meetings.add(new Meeting(LocalDate.of(2025, 6, 10), 90, MeetingType.OPSTARTSMØDE));
        meetings.add(new Meeting(LocalDate.of(2025, 6, 8), 60, MeetingType.PLANLÆGNINGSMØDE));
        meetings.add(new Meeting(LocalDate.of(2025, 6, 5), 30, MeetingType.KONFLIKTLØSENDE));

        Collection.sort(meetings);

        for (Meeting m : meetings){
            System.out.println(m);
        }
    }
}
