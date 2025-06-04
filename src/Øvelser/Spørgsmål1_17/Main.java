package Øvelser.Spørgsmål1_17;

import Øvelser.Spørgsmål1_17.Spøgsmål4.Dream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Jeg elsker java, man kan bruge det til så meget";
        Article article = new Article("Java Magi", text, "Kodemanden");

        System.out.println("Overskrift: " + article.getHeading());
        System.out.println("Forfatter: " + article.getAuthor());
        System.out.println("Indhold: " + article.getBody());

        System.out.println("`\nLængste ord: " + article.getLongestWord());

//        List<Article>moErGay = new ArrayList<>();

//

        ArrayList<String> uniqueWords = article.getWords();
        for (String word : uniqueWords){
            System.out.println("- " + word);
        }
//        System.out.println(moErGay);
    }
}
