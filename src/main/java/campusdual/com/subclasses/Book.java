package campusdual.com.subclasses;

public class Book  extends Item{
    private String author;
    private String isbn;

    public Book(String tittle, String author, String publicationDate, String isbn) {
        super(tittle, publicationDate);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
