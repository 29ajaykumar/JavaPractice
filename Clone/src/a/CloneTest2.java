package a;

class Book implements Cloneable {
    private final int bookId;  // Final field
    private String title;

    // Constructor
    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Override clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    public void display() {
        System.out.println("Book ID: " + bookId + ", Title: " + title);
    }
}

public class CloneTest2 {
    public static void main(String[] args) {
        try {
            Book b1 = new Book(101, "Java Basics");
            Book b2 = (Book) b1.clone(); // Cloning

            b2.setTitle("Advanced Java"); // Only title changes

            System.out.println("Original Book:");
            b1.display();

            System.out.println("Cloned Book:");
            b2.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

