package campusdual.com.interfaces;

import java.util.Date;

public class BookingSystem {
    public static void main(String[] args) {
        CarBooking cb = new CarBooking ("0000BBB");
        cb.book(new Date());
        cb.getTicketDatail();
        cb.cancelBook();
        cb.getTicketDatail();
        FlightBooking fb = new FlightBooking("Iberia", "IBE1234");
        fb.book(new Date(), "V72");
        fb.getTicketDatail();
    }
}
