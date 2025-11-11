package TaskTracker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Here's a step by step process on how to cook pancit canton.\n");
        tracker.add("1. Boil 2 cups of water");
        tracker.add("2. Place pasta in the boiling water");
        tracker.add("3. Let pasta boil for 3 minutes");
        tracker.add("4. Drain the water");
        tracker.add("5. Place pasta on a plate");
        tracker.add("6. Add seasoning and condiments from the pack on to the pasta");
        tracker.add("7. Mix them well");
        tracker.add("8. Enjoy eating:)");

        while (tracker.isEmpty()){
            System.out.println(tracker.head.data);
            System.out.println("Press enter to go to the next step");
            scanner.nextLine();
            tracker.push();

        }
    }
    
}
