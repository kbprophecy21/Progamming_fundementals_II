package chapter6;

public class Course {

    // fields
    private String courseName;
    private Instructor instructor; // using classes
    private TextBook textbook;

    // constructor

    public Course(String newName, Instructor newInstructor, TextBook newtextbook) {
        courseName = newName;
        instructor = new Instructor(newInstructor); // creating deep copy of the referance
        textbook = new TextBook(newtextbook);
    }

    // methods

    /**
     * getter method
     * 
     * @return courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * getter method for instructor
     * 
     * @return instructor
     */
    public Instructor getInstructor() {
        return new Instructor(instructor);
    }

    /**
     * getter method for textbook
     * 
     * @return
     */
    public TextBook getTextBook() {
        return new TextBook(textbook);
    }

    // toString

    public String toString() {
        String s = "\nCourse Name: " + courseName +
                "\nInstructor: " + instructor +
                "\nTextBook: " + textbook;

        return s;
    }

}
