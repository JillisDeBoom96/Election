package nl.novi;

public class Voter extends Person {

    public void vote() {

        System.out.println("stem uitgebracht door: " + super.lastName);
    }
}
