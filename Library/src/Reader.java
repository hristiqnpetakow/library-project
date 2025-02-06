import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private int id;
    private List<Book> borrowedBooks;

    public Reader(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }


    public void loanBook(Book book) {
        if (book == null) {
            System.out.println("Error: the book does not exist!");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Error: the book " + book.getTitle() + " she is already taken!");
            return;
        }

        borrowedBooks.add(book);
        book.setAvailable(false);
        System.out.println(name + " borrows the book " + book.getTitle() + ".");
    }

    public void returnBook(Book book) {
        if (book == null) {
            System.out.println("Error: the book does not exist!");
            return;
        }

        if (!borrowedBooks.contains(book)) {
            System.out.println("Error: the book " + book.getTitle() + " not occupied by this reader.");
            return;
        }

        borrowedBooks.remove(book);
        book.setAvailable(true);
        System.out.println(name + " return the book " + book.getTitle() + ".");
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " there are no borrowed books.");
        } else {
            System.out.println("Books borrowed from " + name + ".");
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle() + " from " + book.getAuthor() + ".");
            }
        }

    }
}
