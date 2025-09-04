package Modifiers;

// Base class
class Book {
    public String ISBN;        // Public → accessible everywhere
    protected String title;    // Protected → accessible in subclasses
    private String author;     // Private → accessible only inside this class

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter and setter for author (private)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass
class EBook extends Book {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookInfo() {
        // Can access ISBN (public) and title (protected)
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
        // Cannot access author directly (private), use getter
        System.out.println("EBook Author: " + getAuthor());
        System.out.println("File Size: " + fileSizeMB + "MB");
    }
}

// Test Class
public class LibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-12345", "Java Programming", "James Gosling", 5.8);

        ebook.displayEBookInfo();

        // Modify author using setter
        ebook.setAuthor("Updated Author");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
