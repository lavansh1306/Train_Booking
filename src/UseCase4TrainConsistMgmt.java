import java.util.LinkedList;

public class UseCase4TrainConsistMgmt {
    public static void main(String[] args) {
        System.out.println("=== UC4 Maintain Ordered Bogie Consist ===");

        // Create a LinkedList for ordered operations
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert bogie at a specific position (e.g., Pantry Car at position 2)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // Remove bogies from front and rear
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist);
        System.out.println("UC4 ordered consist operations completed...");
    }
}
