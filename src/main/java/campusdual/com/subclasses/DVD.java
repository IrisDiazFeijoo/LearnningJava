package campusdual.com.subclasses;

public class DVD extends Item{
    private String direcotr;
    private int duration;

    public DVD(String tittle,String direcotr, int duration, String publicationDate) {
        super(tittle, publicationDate);
        this.direcotr = direcotr;
        this.duration = duration;
    }

    public String getDirecotr() {
        return direcotr;
    }

    public void setDirecotr(String direcotr) {
        this.direcotr = direcotr;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void play(){
        System.out.println( "Playin DVD: " + this.getDetails());
    }
}
