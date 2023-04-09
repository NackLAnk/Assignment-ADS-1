public class Problem1 {
    public static int getMin(int n, int[] arr) { // Define the getMin method
        int a = arr[n-1]; // Set the initial value of a to be the last element of the array

        if(n==1) return a; // Check if in the array have a 1 element, if yes, it returns without check

        int otherMin = getMin(n-1,arr);// call the getMin method recursively with the size of the array reduced by one and the array itself

        return a < otherMin ? a : otherMin; // return the smaller element in array list
    }

}