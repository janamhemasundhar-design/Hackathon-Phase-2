import java.util.Scanner;

public class WasteOptimizer {

    // 3c Method
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3a) Data Types
        int vehicleNumber = 101;
        double wasteCollected = 120.5;
        int collectionPoints = 15;
        char vehicleStatus = 'A';

        System.out.println("--- 3a: Vehicle Details ---");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollected);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        System.out.println();

        // 3b) If-Else Condition
        System.out.println("--- 3b: Target Check ---");
        System.out.print("Enter waste collected in kg: ");
        double inputWaste = scanner.nextDouble();

        if (inputWaste >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
        System.out.println();

        // 3c) Methods
        System.out.println("--- 3c: Total Waste Calculation ---");
        System.out.print("Enter waste collected at point 1 (kg): ");
        double point1 = scanner.nextDouble();

        System.out.print("Enter waste collected at point 2 (kg): ");
        double point2 = scanner.nextDouble();

        double total = calculateTotalWaste(point1, point2);
        System.out.println("Total waste collected: " + total + " kg");

        scanner.close();
    }
}