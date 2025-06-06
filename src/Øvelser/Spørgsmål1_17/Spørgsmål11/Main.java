package Øvelser.Spørgsmål1_17.Spørgsmål11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Teacher(1, "Mads", "Matematik"));
        people.add(new Student(2, "Emma", "emma@email.dk"));
        people.add(new Teacher(3, "Lone", "Biologi"));
        people.add(new Student(4, "Ali", "ali@uni.dk"));

        for (Person p : people) {
            for (String data : p.getData()) {
                System.out.println(data);
            }
            System.out.println("-----------");
        }
    }
}