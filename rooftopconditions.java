import java.util.Scanner;

public class rooftopconditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Added missing quotation marks
        System.out.println("enter the energy generated in kwh"); 
        double energyGenerated = sc.nextDouble();
        
        // Added missing quotation marks around " Energy Generated: " and " kwh "
        System.out.println("Energy Generated: " + energyGenerated + " kwh"); 
        
        // Fixed the logic: > 10 means Good, <= 10 means Low
        if (energyGenerated > 10) { 
            System.out.println("Condition: Good energy generation");
        } else {
            System.out.println("Condition: low energy generation");
        }
        
        sc.close(); // Good practice to close the scanner
    }
}
