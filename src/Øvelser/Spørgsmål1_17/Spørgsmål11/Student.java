package Øvelser.Spørgsmål1_17.Spørgsmål11;

import java.util.Arrays;
import java.util.List;

class Student implements Person {
    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public List<String> getData() {
        return Arrays.asList(
                "Type: Student",
                "ID: " + id,
                "Name: " + name,
                "Email: " + email
        );
    }
}