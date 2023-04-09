public class Problem2 {
    // Taking array from main, adds number and deciding it by array length
    public static double getAverage(int[] arr) {
        int sum = 0; // Initialize the sum of the array elements
        for (int i = 0; i < arr.length; i++) { // Loop over the array elements and add them to the sum
            sum += arr[i];
        }
        return (double) sum / arr.length; // Calculate the average deciding by the length of array, then return Answer
    }
}
