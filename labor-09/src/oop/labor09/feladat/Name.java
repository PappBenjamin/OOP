package oop.labor09.feladat;

public class Name {
    private String FirstName;
    private String LastName;

    public Name(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }


    @Override
    public String toString() {
        return FirstName + " " + LastName;
    }
}
