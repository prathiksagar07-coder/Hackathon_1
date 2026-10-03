public class SolarMonitor {
    public static void main(String[] args) {
        
        int panelId = 10452;
        double energyGeneratedKWh = 45.75;
        int numberOfPanels = 12;
        char systemStatus = 'A'; 

        
    
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGeneratedKWh + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }
}
