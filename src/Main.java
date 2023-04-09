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
            case "3": //problem3
                System.out.println("Please, write the number: "); // there we write number, to check is this a prime or composite
                int n3 = scanner.nextInt(); // taking number from the console

                String PrimeOrComposite = Problem3.getPrimeComposite(n3); // Call the getPrimeComposite method from Problem3 class to identify is number prime or composite
                System.out.println(PrimeOrComposite); // print the Answer
                break;
            case "4": // Problem4
                System.out.println("Please, write the number: "); // there we write number, to recursion number
                int n4 = scanner.nextInt(); // taking number from the console

                int numAnswer = Problem4.getFactorial(n4); // call the getFactorial method from Problem4 class to recursive it to factorial number
                System.out.println("factorial number is: "+numAnswer); // print the Answer
                break;
            case "5": //Problem5
                System.out.println("Please, write the number: "); // there we write number, to find fibonacci
                int n5 = scanner.nextInt(); // taking number from the console

                int fibonacciAns = Problem5.getFibonacci(n5); // call the getFibonacci method from Problem5 class to find fibonacci with recursion
                System.out.println("fibonacci is: "+fibonacciAns); // print the Answer
                break;
            case "6":
                System.out.println("Please, write the number: "); // there we write number
                double n6 = scanner.nextInt(); // taking number from the console

                System.out.println("Please, write the square number: "); // there we write degree number
                int n6_2 = scanner.nextInt(); // taking number from the console

                double squareAnswer = Problem6.getSquare(n6, n6_2); // call the getSquare method from Problem6 class to find degree with 2 variable
                System.out.println("degree is: "+ squareAnswer); // print the Answer
                break;
            case "7":
                System.out.print("Size of the array (Example: 5 or more less/more): "); // Prompt the user to enter the size of the array
                int n7 = scanner.nextInt(); // Read the size of the array

                int[] arr3 = new int[n7];
                for (int i = 0; i < n7; i++) { // Use a for loop to prompt the user to enter the value for each element of the array
                    System.out.print("Element #" + (i + 1) + ": ");
                    arr3[i] = scanner.nextInt();
                }
                Problem7.reverseArray(arr3.length, arr3);  // Use the reverseArray method to reverse the array
                break;

        }


    }
}