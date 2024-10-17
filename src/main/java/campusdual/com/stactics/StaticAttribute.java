package campusdual.com.stactics;

public class StaticAttribute {
    public static int totalCounter = 0;

    public void incrementAndPrintC0unter(){
        StaticAttribute.totalCounter++;
        System.out.println("Counter: " + StaticAttribute.totalCounter);
    }
}
