import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmt {
    public static void main(String[] args) {
        System.out.println("=== UC6 Map Bogie to Capacity (HashMap) ===");

        // Create a HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Map each bogie type to its seating/load capacity
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 64);
        bogieCapacity.put("First Class", 18);
        bogieCapacity.put("Cargo", 100);
        bogieCapacity.put("Engine", 0);

        System.out.println("Bogie Capacity Map:");
        System.out.println(bogieCapacity);

        // Retrieve capacity for a specific bogie
        System.out.println("Capacity of Sleeper: " + bogieCapacity.get("Sleeper"));

        // Update capacity for a bogie
        bogieCapacity.put("AC Chair", 68);
        System.out.println("After Updating AC Chair Capacity:");
        System.out.println("AC Chair Capacity: " + bogieCapacity.get("AC Chair"));

        // Check if a bogie exists in the map
        System.out.println("Contains 'Guard' bogie?: " + bogieCapacity.containsKey("Guard"));

        System.out.println("Final Bogie Capacity Map:");
        System.out.println(bogieCapacity);
        System.out.println("UC6 bogie-capacity mapping completed...");
    }
}
