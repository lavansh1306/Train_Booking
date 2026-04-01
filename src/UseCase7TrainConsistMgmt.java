import java.util.TreeMap;

public class UseCase7TrainConsistMgmt {
    public static void main(String[] args) {
        System.out.println("=== UC7 Sorted Bogie Schedule (TreeMap) ===");

        // Create a TreeMap for sorted bogie-station schedule mapping
        TreeMap<String, String> bogieSchedule = new TreeMap<>();

        // Map each bogie ID to its scheduled station
        bogieSchedule.put("BG104", "Chennai");
        bogieSchedule.put("BG101", "Mumbai");
        bogieSchedule.put("BG103", "Delhi");
        bogieSchedule.put("BG102", "Kolkata");
        bogieSchedule.put("BG105", "Bangalore");

        System.out.println("Bogie Schedule (Sorted by Bogie ID):");
        System.out.println(bogieSchedule);

        // Retrieve schedule for a specific bogie
        System.out.println("Schedule for BG103: " + bogieSchedule.get("BG103"));

        // Display first and last entries (TreeMap provides sorted order)
        System.out.println("First Bogie Entry: " + bogieSchedule.firstKey());
        System.out.println("Last Bogie Entry: " + bogieSchedule.lastKey());

        // Remove a bogie from the schedule
        bogieSchedule.remove("BG105");
        System.out.println("After Removing BG105:");
        System.out.println(bogieSchedule);

        System.out.println("Note: TreeMap maintains keys in sorted (ascending) order automatically.");
        System.out.println("UC7 sorted bogie schedule operations completed...");
    }
}
