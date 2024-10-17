package campusdual.com.stactics;

public class UseOfStatic {
    public static void main(String[] args) {
        System.out.println("Static Method: ");
        System.out.println("================");
        System.out.println(StaticMethod.countDownToYear("Iris",2222));
        System.out.println(StaticMethod.countDownToYear("Iris",1990));
        System.out.println("Static Attribute: ");
        System.out.println("================");
        StaticAttribute sta1 = new StaticAttribute();
        StaticAttribute sta2 = new StaticAttribute();
        StaticAttribute sta3 = new StaticAttribute();


        sta1.incrementAndPrintC0unter();
        sta3.incrementAndPrintC0unter();
        sta2.incrementAndPrintC0unter();
        sta2.incrementAndPrintC0unter();
        sta1.incrementAndPrintC0unter();
        sta3.incrementAndPrintC0unter();
        sta1.incrementAndPrintC0unter();
        sta3.incrementAndPrintC0unter();
        sta1.incrementAndPrintC0unter();
        sta2.incrementAndPrintC0unter();

    }
}
