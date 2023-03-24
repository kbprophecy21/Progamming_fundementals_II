package chapter6;

public class Instructor {

    // fields
    private String lastName;
    private String firstName;
    private String officeNumber;

    // constructor

    public Instructor(String newLastName, String newFirstName, String newOffice) {
        lastName = newLastName;
        firstName = newFirstName;
        officeNumber = newOffice;

    }

    // copy constructor
    public Instructor(Instructor object_two) {
        lastName = object_two.lastName;
        firstName = object_two.firstName;
        officeNumber = object_two.officeNumber;

    }

    public void set(String newLastName, String newFirstName, String newOffice) {
        lastName = newLastName;
        firstName = newFirstName;
        officeNumber = newOffice;
    }

    public String toString() {
        String s = "\n\tLast Name: " + lastName +
                "\n\tFirst Name: " + firstName +
                "\n\tOffice Number: " + officeNumber;

        return s;
    }

}
