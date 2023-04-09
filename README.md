# Assignment-ADS-1

This program contains eight problems that users can choose to solve. The program uses a scanner to read input from the user, and each problem has a different prompt.

To run the program, the user must compile and run the Main.java file. Upon running, the user is prompted with a welcome message and asked to select a problem task by typing in the corresponding number. After selecting a problem, the user is prompted with a specific question and must input their answer into the console.

The 10 problems are as follows:
1.Find the minimum value in an array.
2.Find the average value of an array.
3.Determine if a number is prime or composite.
4.Find the factorial of a number.
5.Find the nth number in the Fibonacci sequence.
6.Raise a number to a certain power.
7.Reverse an array.
8.Determine if a string contains any letters.
9. Find Binomial Coefficient.
10. Find Greatest Common Divisor (GCD).


<TITLE>The first Problem:<TITLE>
``` java
<pre>
public class Problem1 {
    // Get Array from Main, and founding minimum in array
    public static int getMin(int n, int[] arr) { // Define the getMin method
        int a = arr[n-1]; // Set the initial value of a to be the last element of the array

        if(n==1) return a; // Check if in the array have a 1 element, if yes, it returns without check

        int otherMin = getMin(n-1,arr);// call the getMin method recursively with the size of the array reduced by one and the array itself

        return a < otherMin ? a : otherMin; // return the smaller element in array list
    }

}
```
</pre>
<TITLE>Problem Class<TITLE>
The Problem1 class is a utility class for finding the minimum value in an array.
<TITLE>Methods<TITLE>
