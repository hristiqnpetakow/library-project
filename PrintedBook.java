public class PrintedBook extends Book {
    public PrintedBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() + " from " + getAuthor());
    }
}
