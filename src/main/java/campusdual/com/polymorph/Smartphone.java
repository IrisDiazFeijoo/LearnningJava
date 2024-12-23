package campusdual.com.polymorph;

public class Smartphone extends Device implements IChargeable{
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    public void makeACall(){
        System.out.println("Making a call.");
    }

    @Override
    public void charge() {
        System.out.println(this.getBrand() + " " + this.getModel() + "is charging a 15W. ");
    }

    @Override
    public void use() {
        System.out.println("Using touch screen. ");

    }
}
