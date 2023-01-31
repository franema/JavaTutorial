package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.sound.sampled.SourceDataLine;

public class FunctionalProgramming {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Cacho", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Cacho", Gender.MALE),
                new Person("Cacha", Gender.FEMALE));

        // Imperative
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("Declarative");
        // Declarative

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

        people.stream()
            .filter(personPredicate)
            .forEach(System.out::println);

        List<Person> females2 = people.stream()
            .filter(person -> Gender.FEMALE.equals(person.gender))
            .collect(Collectors.toList());

        System.out.println(females2);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }

    enum Gender {
        MALE, FEMALE
    }
}
