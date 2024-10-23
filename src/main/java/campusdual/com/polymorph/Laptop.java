package campusdual.com.polymorph;

public class Laptop extends Device implements IChargeable{

    public Laptop(String brand, String model) {
        super(brand, model);
    }

    public void behaviourOncloseScreem(){
        System.out.println("Close screen, preventing power-saving mode.");
    }


    @Override
    public void charge() {
        System.out.println(this.getBrand() + " " + this.getModel() + "is charging a 65W.");

    }

    @Override
    public void use() {
        System.out.println("Using whith keyboard anda mouse.");

    }
}
