package Øvelser.Spørgsmål1_17.Spørgsmål11;

import java.util.Arrays;
import java.util.List;

class Teacher implements Person {
    private int id;
    private String name;
    private String className;

    public Teacher(int id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public List<String> getData() {
        return Arrays.asList(
                "Type: Teacher",
                "ID: " + id,
                "Name: " + name,
                "Class: " + className
        );
    }
}