package Basics;
import java.util.*;
public class OnlineTicket {
    public static void main(String[] args)
            throws InterruptedException {
        TicketBooking booking = new TicketBooking();
        Thread t1 = new Thread(
                new BookingCounter(booking, "Customer 1"));
        Thread t2 = new Thread(
                new BookingCounter(booking, "Customer 2"));
        Thread t3 = new Thread(
                new BookingCounter(booking, "Customer 3"));
        Thread t4 = new Thread(
                new BookingCounter(booking, "Customer 4"));
        Thread t5 = new Thread(
                new BookingCounter(booking, "Customer 5"));
        Thread t6 = new Thread(
                new BookingCounter(booking, "Customer 6"));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
    }
}

class TicketBooking {
    int  availableTickets = 3;
    List<Integer> tickets = new ArrayList<>();
    public synchronized void bookTicket(String customerName){
        if (availableTickets > 0) // !tickets.isEmpty();
        {
            System.out.println(customerName + "Tickets successfully booked with id" /*tickets.get(0)*/);
            availableTickets--;
//            tickets.remove(0);
            System.out.println("Tickets remaining: " + availableTickets);
        } else {
            System.out.println(customerName + " failed to book. All tickets are sold out.");
        }
    }
}

class BookingCounter implements Runnable{
    TicketBooking tb;
    String customerName;

    public BookingCounter(TicketBooking bookingSystem, String customerName) {
        this.tb = bookingSystem;
        this.customerName = customerName;
    }
    public void run() {
        tb.bookTicket(customerName);
    }
}
