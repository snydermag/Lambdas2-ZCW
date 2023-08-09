package src.src.main.java;

import org.junit.Assert;
import org.junit.Test;

import java.time.Month;


public class PersonTest {

    @Test
    public void getAge() {
        // Given
        int expected = 13;
        Person person = new Person();

        // When
        person.setBirthday(2010, Month.APRIL, 20);

        // Then
        int actual = person.getAge();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getGenderTest(){
        // Given
        Person person = new Person();
        Person.Sex expected = Person.Sex.FEMALE;

        // When
        person.setGender(expected);
        Person.Sex actual = person.getGender();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printPerson() {
    }
}