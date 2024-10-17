package campusdual.com.subclasses;

public class Item {
    private String tittle;
    private String publicationDate;
    private boolean checkedOut = false;


    public Item(String tittle, String publicationDate) {
        this.tittle = tittle;
        this.publicationDate = publicationDate;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDetails(){
        return "Title: " + this.tittle+ " , Publication date: " + this.publicationDate + " , Checked Out: " + this.checkedOut;
    }
}



