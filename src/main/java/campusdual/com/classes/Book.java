package campusdual.com.classes;

import com.campusdual.Utils;

public class Book {

    private String title;
    public String author;
    public int pageNumber;

    public Book(){
        this.title = Utils.string("Write the books tittle: ");
        this.author = Utils.string("Write the book author: ");
        this.pageNumber = Utils.integer(" Write the number of pages: ");

    }

    public Book( String title, String author, int numberOfPages){
        this.title = title;
        this.author = author;
        this.pageNumber = numberOfPages;
    }
    protected void showBookDetails(){
        System.out.println(this.title + " - " + this.author + " - " + "(" + this.pageNumber + " pages)");
    }







    public static void main(String[] args) {
        Book b1 = new Book("Rhytm of war","Brandon Sanderson",1902);
        Book b2 = new Book("The Magician's Appretice","Trudi Canavan",781);
        Book b3 = new Book("El paciente", "Juan Gómez-Jurado",471);
        Book b4 = new Book();

        b1.showBookDetails();
        b2.showBookDetails();
        b3.showBookDetails();
        b4.showBookDetails();

    }
}
