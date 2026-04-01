import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmt {
    public static void main(String[] args) {
        System.out.println("=== UC2 Add Passenger Bogies to Train ===");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies: Sleeper, AC Chair, First Class
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Remove one bogie (e.g., AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Use contains() to check for bogie availability
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper?: " + exists);

        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);
        System.out.println("UC2 operations completed successfully...");
    }
}
