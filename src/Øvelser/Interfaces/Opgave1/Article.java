package Øvelser.Interfaces.Opgave1;

public class Article implements Printable {
    private String title;
    private String author;

    public Article (String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public void printInfo() {
        System.out.println( "Title: " + title + "Author: " + author);
    }
    @Override
    public String toString(){
        return title + " " + author;
    }
}
