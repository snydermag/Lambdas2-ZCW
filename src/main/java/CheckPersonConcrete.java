package src.src.main.java;

public class CheckPersonConcrete implements CheckPerson {

    public boolean test(Person p) {
        return (p.getAge() < 10);
    }
}
