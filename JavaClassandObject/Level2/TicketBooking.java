package JavaClassandObject.Level2;

public class TicketBooking {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    TicketBooking(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Null";
        this.price = 0.0;
        this.isBooked = false;
    }

    // Method to book ticket
    public void bookTicket(String seatNumber, double price) {
        if (isBooked) {
            System.err.println("House full!!! Sorry... Ticket already booked");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked for movie: " + this.movieName);
            System.out.println("Seat Number: " + this.seatNumber);
            System.out.println("Price: $" + this.price);
        }
    }

    // Method to display ticket details
    public void displayTicket() {
        if (this.isBooked) {
            System.out.println("Ticket booked for movie: " + this.movieName);
            System.out.println("Seat Number: " + this.seatNumber);
            System.out.println("Price: $" + this.price);
        } else {
            System.out.println("Ticket has not been booked yet...");
        }
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        TicketBooking ticket1 = new TicketBooking("Dragon");

        ticket1.displayTicket();
        ticket1.bookTicket("A10", 120.0);
        ticket1.bookTicket("B10", 120.0); // Attempt to book again
        ticket1.bookTicket("A11", 120.0); // Attempt to book again
        ticket1.displayTicket();
    }
}
