import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {
    public static void main(String[] args) {
        System.out.println("=== UC3 Track Unique Bogie IDs ===");

        // Create a Set to store unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add IDs (including intentional duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG104");

        // Duplicate entries will be ignored automatically by HashSet
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIDs);

        System.out.println("Note: Duplicates are automatically ignored by HashSet.");
        System.out.println("UC3 uniqueness validation completed...");
    }
}
