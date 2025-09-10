package Constructor;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // book is available by default
    }

    // Method to borrow a book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
}
