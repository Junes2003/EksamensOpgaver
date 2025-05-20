package Øvelser.Sortering.Opgave1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NameSorter {
        public static void main(String[] args) {
            List<Person> people = new ArrayList<>();
            people.add(new Person("Mo"));
            people.add(new Person("Junes"));
            people.add(new Person("Alan"));
            people.add(new Person("Aden"));

            people.sort(Comparator.comparingInt(Person::getNameLength));

            for (Person p : people) {
                System.out.println(p);
            }
        }
    }

