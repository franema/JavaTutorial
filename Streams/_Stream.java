package Streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static Streams._Stream.Gender.MALE;
import static Streams._Stream.Gender.FEMALE;


public class _Stream {
    
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Cacho", MALE),
                new Person("Maria", FEMALE),
                new Person("Cacho", MALE),
                new Person("Cacha", FEMALE)
            );

        // people.stream()
        //     .map(person -> person.gender)
        //     .collect(Collectors.toSet())
        //     .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        boolean containsOnlyFemales = people.stream()
            // .allMatch(person -> FEMALE.equals(person.gender));
            .allMatch(personPredicate);

        System.out.println(containsOnlyFemales);
            
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
