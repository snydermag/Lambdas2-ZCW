package src.src.test.java;

import org.junit.Test;
import src.src.main.java.CheckPersonConcrete;
import src.src.main.java.Person;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CheckPersonTest {

    @Test
    public void checkPersonWithLocalClass(){
        // Given
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
    }
}
