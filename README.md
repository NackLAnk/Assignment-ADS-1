# Assignment-ADS-1

* This program contains eight problems that users can choose to solve. The program uses a scanner to read input from the user, and each problem has a different prompt.

> To run the program, the user must compile and run the Main.java file. Upon running, the user is prompted with a welcome message and asked to select a problem task by > typing in the corresponding number. After selecting a problem, the user is prompted with a specific question and must input their answer into the console.

### The 10 problems are as follows:
1. Find the minimum value in an array.
2. Find the average value of an array.
3. Determine if a number is prime or composite.
4. Find the factorial of a number.
5. Find the nth number in the Fibonacci sequence.
6. Raise a number to a certain power.
7. Reverse an array.
8. Determine if a string contains any letters.
9. Find Binomial Coefficient.
10. Find Greatest Common Divisor (GCD).


# The first Problem:
``` java

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
# Problem Class

* The Problem1 class is a utility class for finding the minimum value in an array.

# Methods

> This method takes in two parameters, an integer `n` and an integer array `arr`. It returns the minimum value in the array `arr`.

> `n`: the size of the array * `arr`
> `arr`: the integer array containing the values to search for the minimum
* If the size of the array is 1, the method returns the only element in the array. Otherwise, it calls itself recursively with the size of the array reduced by one and the array itself to find the minimum value.
### Example usage of code:
``` java
int[] array = {5, 8, 3, 1, 9, 2};
int min = Problem1.getMin(array.length, array); // min = 1
```
# The second problem
``` java
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
```
> To use this code, you need to have an array of integers. You can call the `getAverage` method and pass the array as an argument. The method will calculate the average of the elements in the array and return it as a double.
### Example usage:
``` java
int[] myArray = {1, 2, 3, 4, 5};
double average = Problem2.getAverage(myArray);
System.out.println("The average is: " + average);
```
### output:
``` java
The average is: 3.0
``` 
# The third Problem
> This class contains a static method for checking whether a given number is prime or composite.
#### `public static String getPrimeComposite(int n)`
> This method takes an integer `n` as input and returns a string indicating whether `n` is prime or composite. If n is less than or equal to 1, the method returns `"composite"`. Otherwise, the method checks for divisors of n up to the square root of n. If a divisor is found, the method returns `"composite"`. If no divisors are found, the method returns `"prime"`.
### Parameters
`n` : an integer to check for primality or compositeness.
### Returns
`"prime"` if n is a prime number.
`"composite"` if n is a composite number
### Example usage of code:
```java
int n1 = 7;
String result1 = Problem3.getPrimeComposite(n1); // result1 = "prime"

int n2 = 15;
String result2 = Problem3.getPrimeComposite(n2); // result2 = "composite"
```
# Problem Number Four
```java
public class Problem4 {
     // Returns the factorial of the given number using recursion.
    public static int getFactorial(int n) {
        if (n == 0) { // Base case: if n is 0, return 1
            return 1;
        } else {
            return n * getFactorial(n - 1); // Recursive case: multiply n with the factorial of (n-1)
        }
    }
}
```
 > class provides a method to calculate the factorial of a given number using recursion.
 ### Method:
 ```java
 public static int getFactorial(int n)
 ```
 ### Parameters:
 * `n`: An integer value to calculate the factorial of.
 ### Returns:
 * An integer value that represents the factorial of the given number `n`.
 ### Descriptiob: 
 * The `getFactorial` method uses a recursive approach to calculate the factorial of a given number. The method checks if the base case of `n=0` is reached, in which case the method returns 1. Otherwise, the method calls itself with the argument `(n-1)` and multiplies the result with the value of `n`. This recursive call continues until the base case is reached.
### Problem Number Five
```java
public class Problem5 {
    //Finds the n-th element in the Fibonacci sequence using recursion.
    public static int getFibonacci(int n) {
        if (n == 0) { // base case for 0 and 1
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacci(n-1) + getFibonacci(n-2); // recursive case
        }
    }
}
```
