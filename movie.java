import java.util.Scanner;

class MovieTicket {
    // Data members
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Parameterized constructor
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Method to calculate total ticket amount
    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Method to calculate discount (10% if 5 or more tickets)
    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    // Method to calculate final amount after discount
    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Method to display the complete booking bill
    public void displayBill() {
        System.out.println("\n----- BOOKING BILL -----");
        System.out.println("Movie Name:        " + movieName);
        System.out.printf("Ticket Price:      $%.2f\n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount:      $%.2f\n", calculateTotal());
        System.out.printf("Discount Applied:  $%.2f\n", calculateDiscount());
        System.out.println("------------------------");
        System.out.printf("Final Amount Due:  $%.2f\n", calculateFinalAmount());
        System.out.println("------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input values from the user
        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = scanner.nextDouble();

        System.out.print("Enter number of tickets: ");
        int numberOfTickets = scanner.nextInt();

        // Creating MovieTicket object using the constructor
        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        // Displaying the final bill (which internally invokes the calculation methods)
        ticket.displayBill();

        scanner.close();
    }
}
