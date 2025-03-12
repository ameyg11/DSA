package Basic;  // Remove this line if you don't have a package named 'Basic'

import java.util.Scanner;

public class tripProblem {  // Class name should match the filename

    public static double tripCostSharing(int[] cost) {
        int n = cost.length;
        double average = 0;

        for (int amount : cost) {
            average += amount;
        }
        average /= n;

        double giveMoney = 0;
        double takeMoney = 0;

        for (int amount : cost) {
            double difference = Math.round((amount - average) * 100.0) / 100.0;
            if (difference > 0) {
                giveMoney += difference;
            } else {
                takeMoney += -difference;
            }
        }

        return Math.round(Math.max(giveMoney, takeMoney) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        if (n <= 0 || n > 1000) {
            System.out.println("Invalid number of students.");
            scanner.close();
            return;
        }

        // Input cost
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter amount spent by student " + (i + 1) + ": ");
            int amount = scanner.nextInt();
            if (amount < 0 || amount > 10000) {
                System.out.println("Invalid amount.");
                scanner.close();
                return;
            }
            cost[i] = amount;
        }

        double result = tripCostSharing(cost);
        System.out.println("Minimum amount to be exchanged: " + result);

        scanner.close();
    }
}
