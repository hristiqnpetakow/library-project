public class EBook extends Book {

    public EBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("El book: " + getTitle() + " from " + getAuthor());
    }
}
