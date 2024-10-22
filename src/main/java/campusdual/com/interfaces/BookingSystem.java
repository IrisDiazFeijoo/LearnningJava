package campusdual.com.interfaces;

import java.util.Date;

public class BookingSystem {
    public static void main(String[] args) {
        CarBooking cb = new CarBooking ("0000BBB");
        cb.book(new Date());
        cb.getTicketDatail();
        cb.cancelBook();
        cb.getTicketDatail();
    }
}
