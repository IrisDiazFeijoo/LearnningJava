package campusdual.com.subclasses;

public class Library {
    public static void main(String[] args) {
        Item item = new Item("New Item", "2010-01-02");
        Book book = new Book("The Martian Chromicles","Ray Bradbury", "1950-05-04","9788445076538");
        System.out.println(item.getDetails());
        System.out.println(book.getDetails());
    }
}
