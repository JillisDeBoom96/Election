package nl.novi;

public class Candidate extends Person {


    public void talk() {
        System.out.println("Kandidaat praat veel: " + super.getFullName());

    }
}
