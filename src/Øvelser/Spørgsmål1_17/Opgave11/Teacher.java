package Øvelser.Spørgsmål1_17.Opgave11;

public class Teacher implements Person {
    private int id;
    private String name;
    private String classs;
}

public Teacher (int id, String name, String classs){
    this.id = id;
    this.name = name;
    this.className = classs;
}
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String className(){
        return className();
    }

