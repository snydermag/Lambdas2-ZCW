package src.src.main.java;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("Joe Huntenburg", LocalDate.of(2010, Month.APRIL, 24),
                Person.Sex.MALE, "himynameisjoe@gmail.com"));
        listOfPeople.add(new Person("Minsoo Jo", LocalDate.of(2023, Month.AUGUST, 8),
                Person.Sex.MALE, "bestchef@chef.com"));
        listOfPeople.add(new Person("Maggie Snyder", LocalDate.of(2010, Month.DECEMBER, 25),
                Person.Sex.MALE, "merrybirthday@christmas.com"));
        listOfPeople.add(new Person("Angela Kim", LocalDate.of(2023, Month.FEBRUARY, 14),
                Person.Sex.FEMALE, "love@love.com"));

        // When
        CheckPersonConcrete tester = new CheckPersonConcrete();

        // Then
        Person.printPersons(listOfPeople, tester);

        System.out.println();

        CheckPerson anonymous = new CheckPerson(){
            public boolean test(Person p) {
                return (p.getAge() > 10);
            }

        };

        Person.printPersons(listOfPeople, anonymous);

        System.out.println();

        Person.printPersons(listOfPeople, (Person p) -> p.getAge() > 10);
    }
}
