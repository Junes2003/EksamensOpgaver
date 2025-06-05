package Øvelser.Spørgsmål1_17.Spørgsmål17;

import java.util.ArrayList;
import java.util.HashSet;

public class Article {
    private String heading;
    private String body;
    private String author;

    public Article(String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public String getHeading(){
        return heading;
    }

    public String getBody(){
        return body;
    }

    public String getAuthor(){
        return author;
    }

    public String getLongestWord(){
        String[] words = body.split("//W+");
        String longestWord = "";
        for (int i = 0; i < words.length; i++ ) {
            if (words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public ArrayList <String> getWords(){
        String cleanedBody = removePunctutation(body).toLowerCase();
        String[] words = cleanedBody.split(" ");
        HashSet<String> uniqueSet = new HashSet<>();
        ArrayList<String> uniqueWords = new ArrayList<>();

        for (String word : words){
            if (!uniqueSet.contains(word) && !word.isBlank()){
                uniqueSet.add(word);
                uniqueWords.add(word);
            }
        }
        return uniqueWords;
    }

    private String removePunctutation(String text){
        return text.replaceAll("^a-zA-ZæøåÆØÅ", "");
    }

    @Override
    public String toString(){
        return "Heading: " + heading + "\n"
                + "Body:" + body + "\n"
                + "Author" + author;
    }

}
