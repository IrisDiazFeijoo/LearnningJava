package campusdual.com.encapsulation;

public class Vehicle {
    // Definamos atributos, como : marca, modelo, matrícula, disponibilidad para alquilar y velocidad máxima legal
    private String brand;
    private String licensePlate;
    private String model;
    private boolean available;
    public static final int LEGAL_MAX_SPEED = 120;

    public Vehicle(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.available = true;
    }

    public String getLicensePlate(){
        return this.licensePlate;

    }
    public void setLicensePalte(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePaltete() {
        return licensePlate;
    }

    public void setLicensePaltete(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
