package campusdual.com.interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class CarBooking implements IBooking {
    private String licensePlate;
    private boolean booked;
    private Date bookDate;
    private SimpleDateFormat sdf  = new SimpleDateFormat("dd-MM-yyyy");

    public CarBooking(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public void  book (Date bookDate,String... args){
        if(!this.booked){
            this.booked= true;
            this.bookDate = bookDate;
            System.out.println(this.licensePlate + " car booked successfully. ");

        }else{
            System.out.println(this.licensePlate + " car is already booked. ");
        }
    }
    @Override
    public void cancelBook() {
        if (this.booked){
            this.booked = false;
            System.out.println("Booking for " + this.licensePlate + " cancelled.");
        }else{
            System.out.println(this.licensePlate + "car is not rented.");
        }

    }

    @Override
    public void getTicketDatail() {



        if(this.booked){
            System.out.println(this.licensePlate + " car booked for " + this.sdf.format(this.bookDate));
        }else{
            System.out.println(this.licensePlate + " car is not rented.");
        }

    }

}



