import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmt {
    public static void main(String[] args) {
        // Display welcome banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================");

        // Initialize an empty List using ArrayList
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");

        // Display initial bogie count using size()
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Prints the current state of the train
        System.out.println("Current Train Consist: " + trainConsist);
        System.out.println("System ready for operations...");
    }
}
