import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book \"" + book.getTitle() + "\" from " + book.getAuthor() + " is added to the library.");
    }

    public void searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found book: ");
                book.displayInfo();
                return;
            }
        }
        System.out.println("The book is not found: " + title);
    }

    public void searchByAuthor(String author) {

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Found book: ");
                book.displayInfo();
                return;
            }
        }
        System.out.println("There are no found books from: " + author);
    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAvailableBooks() {
        System.out.println("Available books in the library: ");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }
}
