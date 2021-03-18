package nl.novi;

public class Election {

    public void prepareCandidates() {
        Candidate rutte = new Candidate();
        rutte.firstName = "Mark";
        rutte.lastName = "Rutte";

        System.out.println("kandidaat toegevoegd: " + rutte.getFullName());
    }

    public void prepareVoters() {
        Voter jillis = new Voter();
        jillis.firstName = "jillis";
        jillis.lastName = "de Boom";
        jillis.vote();

        System.out.println("Stemmer toegevoegd " + jillis.getFullName());
    }
}
