package Øvelser.Interfaces.Opgave1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> list = new ArrayList<>();

        Article article1 = new Article("Title: " + "Mo stinker", "Author: " + "Mo osman");
        Article article2 = new Article("Title: " + "Ali er god til fodbold", "Author: " + "Ali");

        list.add(article1);
        list.add(article2);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
