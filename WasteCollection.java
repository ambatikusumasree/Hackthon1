import java.util.Scanner;

public class WasteCollection {

    // 3c) Method definition to calculate total waste collected
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Municipal Waste Collection Optimizer ===");

        // --- PART 3a: Storing & Displaying Initial Vehicle Details ---
        System.out.println("\n[Part 3a: Initial Vehicle Details]");
        int vehicleNumber = 104;
        double wasteCollectedKg = 450.75; 
        int collectionPoints = 15;
        char vehicleStatus = 'A'; // 'A' for Active

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Initial Waste Collected: " + wasteCollectedKg + " kg");
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);


        // --- PART 3c: Methods & Dynamic Collection Input ---
        System.out.println("\n[Part 3c: New Collection Points]");
        System.out.print("Enter waste collected at point 1 (in kg): ");
        double point1 = input.nextDouble();

        System.out.print("Enter waste collected at point 2 (in kg): ");
        double point2 = input.nextDouble();

        // Calling the method to calculate the total of the two points
        double dynamicTotalWaste = calculateTotalWaste(point1, point2);
        System.out.println("Total waste collected from these two points: " + dynamicTotalWaste + " kg");


        // --- PART 3b: If-Else Condition Evaluated on the New Collection ---
        System.out.println("\n[Part 3b: Target Evaluation for New Collection]");
        // Checking status based on the total calculated in part 3c
        if (dynamicTotalWaste >= 100.0) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        input.close();
    }
}
