public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new PrintedBook("War and Peace", "Leo Tolstoy"));
        library.addBook(new EBook("1984", "George Orwell"));
        library.addBook(new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald"));


        Reader reader1 = new Reader("John Doe", 1);
        Reader reader2 = new Reader("Jane Smith", 2);

        library.searchByTitle("1984");

        // Reader John Doe picks up a book
        reader1.loanBook(library.getBookByTitle("1984"));

        // Attempting to borrow an already borrowed book
        reader2.loanBook(library.getBookByTitle("1984"));

        // John Doe returns the book
        reader1.returnBook(library.getBookByTitle("1984"));

        // Jane Smith can now occupy it
        reader2.loanBook(library.getBookByTitle("1984"));

        // Show available books
        library.displayAvailableBooks();

    }
}
