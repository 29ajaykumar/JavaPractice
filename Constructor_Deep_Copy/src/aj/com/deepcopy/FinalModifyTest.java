package aj.com.deepcopy;

class Book1 {
    private final int bookId;   // final field
    private String title;

    // Regular constructor
    public Book1(int bookId, String title) {
        this.bookId = bookId;  // ✅ valid: assigning final field
        this.title = title;
    }

    // Copy constructor (allows modifying final field *for the new object*)
    public Book1(Book1 other, int newId) {
        this.bookId = newId;   // ✅ still valid: first and only assignment for *this* object
        this.title = other.title;
    }

    public void display() {
        System.out.println("Book ID: " + bookId + ", Title: " + title);
    }
}

public class FinalModifyTest {
    public static void main(String[] args) {
        Book1 b1 = new Book1(100, "Java Basics");

        // Using copy constructor to "modify" final field
        Book1 b2 = new Book1(b1, 200);  // new object, new final field value

        b1.display();  // Output: Book ID: 100, Title: Java Basics
        b2.display();  // Output: Book ID: 200, Title: Java Basics
    }
}
