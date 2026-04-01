import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5TrainConsistMgmt {
    public static void main(String[] args) {
        System.out.println("=== UC5 Preserve Insertion Order of Bogies ===");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // Attach bogies in order
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Attempt to attach a duplicate bogie
        formation.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("Note: LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println("UC5 formation setup completed...");
    }
}
