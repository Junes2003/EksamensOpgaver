package Øvelser.Spørgsmål1_17.Spøgsmål4;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    List<Dream> moErGay = new ArrayList<>();

    Dream dream1 = new Dream(20, "Mareridt");
    Dream dream2 = new Dream(5, "Problemløsende");
    Dream dream3 = new Dream(11, "Neutral");

    moErGay.add(dream1);
    moErGay.add(dream2);
    moErGay.add(dream3);

    moErGay.sort(Comparator.comparing(Dream::getDate));
        System.out.println(moErGay);

    }
}

