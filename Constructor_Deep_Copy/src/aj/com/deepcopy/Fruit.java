package aj.com.deepcopy;
class Book {
    private final int bookId;   // final variable
    private String title;

    // Regular constructor
    public Book(int bookId, String title) {
        this.bookId = bookId;   // final can be assigned here
        this.title = title;
    }

    // Copy constructor
    public Book(Book other) {
        this.bookId = other.bookId;   // final can be assigned once (here)
        this.title = new String(other.title); // deep copy of mutable field
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book ID: " + bookId + ", Title: " + title);
    }
}

public class Fruit {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Basics");
        Book b2 = new Book(b1); // Creating a copy

        b2.setTitle("Advanced Java"); // Only title changes, not bookId

        System.out.println("Original Book:");
        b1.display();

        System.out.println("Copied Book:");
        b2.display();
    }
}
