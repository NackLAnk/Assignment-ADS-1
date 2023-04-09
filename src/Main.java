import java.util.Scanner; // This scanner need for my code, because other users must select problem tasks

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome! Please, select the problem task.");
        System.out.println("Example: Problem1 = 1, Problem2 = 2");
        Scanner scanner = new Scanner(System.in); // Create overall new Scanner to read input
        String Answer = scanner.nextLine();

        switch(Answer) {
            case "1": // Problem1
                System.out.print("Size of the array (Example: 5 or more less/more): "); // Prompt the user to enter the size of the array
                int n = scanner.nextInt(); // Read the size of the array

                int[] arr = new int[n]; // Create a new integer array of the specified size
                for (int i = 0; i < n; i++) { // Use a for loop to prompt the user to enter the value for each element of the array
                    System.out.print("Element #" + (i + 1) + ": ");
                    arr[i] = scanner.nextInt();
                }
                int Min = Problem1.getMin(arr.length, arr);  // Call the getMin method from the Problem1 class to find the minimum value in the array
                System.out.println("Minimum: "+Min); // Print the minimum value to the console
                break;
            case "2": // Problem2
                System.out.print("Size of the array (Example: 5 or less/more): "); // Prompt the user to enter the size of the array
                int n2 = scanner.nextInt(); // Read the size of the array

                int[] arr2 = new int[n2]; // Create a new integer array of the specified size
                for (int i = 0; i < n2; i++) { // Use a for loop to prompt the user to enter the value for each element of the array
                    System.out.print("Element #" + (i + 1) + ": ");
                    arr2[i] = scanner.nextInt();
                }
                double average = Problem2.getAverage(arr2); // Call the getAverage method from Problem2 class to find average
                System.out.println("Average: "+ average); // print the average of the array
                break;
            case "3":

        }


    }
}