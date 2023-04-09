import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome! Please, select the problem task.");
        System.out.println("Example: Problem1 = 1, Problem2 = 2");
        Scanner scanner = new Scanner(System.in); // Create overall new Scanner to read input
        String Answer = scanner.nextLine();

        switch(Answer) {
            case "1":
                System.out.print("size of the array (Example: 5 or more): "); // Prompt the user to enter the size of the array
                int n = scanner.nextInt(); // Read the size of the array

                int[] arr = new int[n]; // Create a new integer array of the specified size
                for (int i = 0; i < n; i++) { // Use a for loop to prompt the user to enter the value for each element of the array
                    System.out.print("Element #" + (i + 1) + ": ");
                    arr[i] = scanner.nextInt();
                }
                int Min = Problem1.getMin(arr.length, arr);  // Call the getMin method from the Problem1 class to find the minimum value in the array
                System.out.println("Minimum: "+Min); // Print the minimum value to the console
            case "2":
        }


    }
}