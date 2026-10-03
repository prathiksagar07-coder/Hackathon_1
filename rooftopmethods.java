import java.util.Scanner;

public class rooftopmethods {
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter morning energy in kWh: ");
        double morning = sc.nextDouble();
        
        System.out.print("Enter evening energy in kWh: ");
        double evening = sc.nextDouble();
        
        double total = calculateTotalEnergy(morning, evening);
        System.out.println("Total energy generated: " + total + " kWh");
        
        // Corrected line below
        sc.close(); 
    }
}
