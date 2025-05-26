import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

public class Main {
    static ArrayList<Book> bookCollection = new ArrayList<>();

    public static void addBook(Book book) {
        bookCollection.add(book);
        System.out.println("Book added to collection!");
    }

    public static void removeBook(Book book) {
        if (bookCollection.remove(book)) {
            System.out.println("Book removed from collection!");
        } else {
            System.out.println("Book not found in collection!");
        }
    }

    public static void displayBooks() {
        for (Book book : bookCollection) {
            book.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "123456789");
        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "987654321");

        addBook(book1);
        addBook(book2);

        System.out.println("Books in collection:");
        displayBooks();

        removeBook(book1);

        System.out.println("Books in collection after removal:");
        displayBooks();
    }
}
