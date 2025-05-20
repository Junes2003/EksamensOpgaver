package Øvelser.Sortering.Opgave1;

public class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getNameLength() {
            return name.length();
        }

        @Override
        public String toString() {
            return name + " (" + getNameLength() + " bogstaver)";
        }
    }
