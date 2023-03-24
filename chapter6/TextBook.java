package chapter6;

public class TextBook {

    // fields

    private String title;
    private String author;
    private String publisher;

    // constructors
    public TextBook(String newTitle, String newAuthor, String newPublisher) {
        title = newTitle;
        author = newAuthor;
        publisher = newPublisher;

    }

    // copy constructor

    public TextBook(TextBook object_two) {
        title = object_two.title;
        author = object_two.author;
        publisher = object_two.publisher;
    }

    // methods
    public void set(String newTitle, String newAuthor, String newPublisher) {
        title = newTitle;
        author = newAuthor;
        publisher = newPublisher;
    }

    public String toString() {
        String s = "\n\tTitle Book: " + title +
                "\n\tAuthor of Book: " + author +
                "\n\tPublisher of Book: " + publisher;

        return s;
    }
}
