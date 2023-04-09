# Assignment-ADS-1

* This program contains `10 problems` that users can choose to solve. The program uses a scanner to read input from the user, and each problem has a different prompt.

> To run the program, the user must compile and run the Main.java file. Upon running, the user is prompted with a welcome message and asked to select a problem task by typing in the corresponding number. After selecting a problem, the user is prompted with a specific question and must input their answer into the console.

### The 10 problems are as follows:
1. Find the minimum value in an array.
2. Find the average value of an array.
3. Determine if a number is prime or composite.
4. Find the factorial of a number.
5. Find the n-th number in the Fibonacci sequence.
6. Raise a number to a certain power.
7. Reverse an array.
8. Determine if a string contains any letters.
9. Find Binomial Coefficient.
10. Find Greatest Common Divisor (GCD).


# Problem 1: Finding the minimum element in an array
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
> The Problem1 class is a utility class for finding the minimum value in an array.

### Methods:
* This method takes in two parameters, an integer `n` and an integer array `arr`. It returns the minimum value in the array `arr`.
### Parameters:
* `n`: the size of the array * `arr`
* `arr`: the integer array containing the values to search for the minimum
### Description:
* If the size of the array is 1, the method returns the only element in the array. Otherwise, it calls itself recursively with the size of the array reduced by one and the array itself to find the minimum value.
### Example usage of code:
``` java
int[] array = {5, 8, 3, 1, 9, 2};
int min = Problem1.getMin(array.length, array); // min = 1
```
# Problem 2: Calculating the average of an array
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
### Example usage of code:
``` java
int[] myArray = {1, 2, 3, 4, 5};
double average = Problem2.getAverage(myArray);
System.out.println("The average is: " + average);
```
### output:
``` java
The average is: 3.0
``` 
# Problem 3: Checking if a number is prime or composite
```java
public class Problem3 {
    // Checking a number, then identifying it Prime or Composite
    public static String getPrimeComposite(int n){
        if (n <= 1) { // Check if n is less than or equal to 1
            return "composite";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Check for divisors up to the square root of n
            if (n % i == 0) {
                return "composite";
            }
        }
        return "prime"; // If no divisors were found, n is prime
    }
}
```
> This class contains a static method for checking whether a given number is prime or composite.
#### `public static String getPrimeComposite(int n)`
* This method takes an integer `n` as input and returns a string indicating whether `n` is prime or composite. If n is less than or equal to 1, the method returns `"composite"`. Otherwise, the method checks for divisors of n up to the square root of n. If a divisor is found, the method returns `"composite"`. If no divisors are found, the method returns `"prime"`.
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
# Problem 4: Calculating the factorial of a number
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
# Problem 5: Finding the n-th element in the Fibonacci sequence
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
> This program defines a method `getFibonacci` that takes an integer `n`, and returns the n-th element in the Fibonacci sequence. It uses recursion to calculate the sum of the previous two elements in the sequence until it reaches the base cases of 0 and 1, which return 0 and 1, respectively.
* 
### Example usage of code:
```java
int n = 6;
        int fibonacciNum = Problem5.getFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is " + fibonacciNum);
```
### Output:
```java
Fibonacci is: 8
```
# Problem 6: Raise a number to a certain power
```java
public class Problem6 {
    // this method taking a number then square it by "n", then return the Answer
    public static double getSquare(double n, int n_2) {
        if (n_2 == 0) { // checking if degree is 0
            return 1;
        }
        double Ans = 1; // created variable to take future answer
        while (n_2 > 0) { // loop to check if degree more than 0
            if (n_2 % 2 == 1) { // the while loop, the method checks if n_2 is odd by using the modulus operator %
                Ans *= n;
            }
            n *= n; // the method multiplies n by itself to update its value, and divides n_2 by 2
            n_2 /= 2;
        }
        return Ans; // return the Answer
    }
}
```
* This class contains a method to calculate the square of a given number with a specified degree using a faster algorithm called "Exponentiation by squaring".
### Method:
```java
public static double getSquare(double n, int n_2)
```
### Parameters:
* `n` - a double value that represents the base number to be squared
* `n_2` - an integer value that represents the degree of the squared number
### Description:
* The method first checks to see if the power of `n_2` is 0. If so, the method returns 1. Otherwise, it initializes the Ans variable to 1 to store the future response. It then enters the while loop to check if the power of `n_2` is greater than 0. Inside the while loop, the method checks if `n_2` is odd using the % modulo operator. If so, the method multiplies Ans by `n`. It then multiplies n by itself to update its value, and divides `n_2` by 2. This process continues until `n_2` is 0. Finally, the method returns Ans as the square of `n` to the power of `n_2`.
# Problem 7: Reverse an array.
```java
public class Problem7 {
    // this method will reverse created by user array
    public static void reverseArray(int n, int[] arr) {
        for (int i = n - 1; i >= 0; i--) { // Print the array in reverse order
            System.out.print(arr[i] + " ");
        }
    }
}
```
> The Problem7 class contains a method called reverseArray, which takes an integer n and an integer array arr as input. This method prints the elements of the array in reverse order.
### Method:
```java
public static void reverseArray(int n, int[] arr)
```
### Parameters:
* `n`: An integer representing the size of the array.
* `arr`: An integer array to be reversed.
### Example usage of code:
```java
int[] arr = {1, 2, 3, 4, 5};
Problem7.reverseArray(arr.length, arr); // prints "5 4 3 2 1"
```
# Problem 8: Determine if a string contains any letters.
```java
public class Problem8 {
    // This method check letters in String, then return the analysis
    public static String getDigits(String a) {
        for (int i = 0; i < a.length(); i++) { // this loop check letters in String
            if (!Character.isDigit(a.charAt(i))) {
                return "yes";
            }
        }
        return "no"; // if loop don't found letters, then it return "no"
    }
}
```
> Problem8 is a Java class that contains a single static method called "getDigits". This method takes a string parameter "a" and returns a string indicating if the input string contains any digits or not.
### Method:
```java
public static String getDigits(String a)
```
### Parameters:
`a`: a string parameter to be analyzed.
### Example Usage of code:
```java
String result = Problem8.getDigits("hello123");
System.out.println(result); // Output: yes

String result2 = Problem8.getDigits("hello world");
System.out.println(result2); // Output: no
```
# Problem 9: Find Binomial Coefficient.
```java
public class Problem9 {
    // This method returns the binomial coefficient C(n,k) using recursion
    public static int getCoefficient(int n, int k) {
        if (k == 0 || k == n) { // checks if there is 0 here or if the answers do not match
            return 1;
        }
        return getCoefficient(n-1, k-1) + getCoefficient(n-1, k); // Recursive case
    }
}
```
> The method uses the recursive formula C(n,k) = C(n-1,k-1) + C(n-1,k) to calculate the binomial coefficient. The base case of the recursion is when k is 0 or k is equal to n, in which case the binomial coefficient is 1.
### Methods:
getCoefficient(int n, int k)
> Returns the binomial coefficient C(n,k) using recursion.
### Parameters: 
* The parameters of Problem9 are two integers `n` and `k` representing the values of the binomial coefficient C(n,k) to be computed.
### Examle Usage of code:
```java
    Problem9 problem = new Problem9();
    int result = problem.getCoefficient(5, 2);
    // result will be 10
```
# Problem 10: Find Greatest Common Divisor (GCD)
```java
public class Problem10 {
    /*  Recursive function to find the GSD of two numbers
     *  @param a First number
     *  @param b Second number
     */
    public static int getGSD(int a, int b) {
        if (b == 0) { //
            return a;
        }
        return getGSD(b, a % b);
    }
}
```
> The `Problem10` class contains a single static method `getGSD` which calculates the Greatest Common Divisor (GCD) of two given numbers `a` and `b` using recursion.
### Parameters:
* `getGSD`: This method takes in two integers a and b, and returns an integer that represents their greatest common divisor (GCD).
* `a`: The first number.
* `b`: The second number.
### Example usage of code:
```java
int a = 18;
int b = 12;
int gcd = Problem10.getGSD(a, b);
System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
// Output: The GCD of 18 and 12 is 6```

# Coclusion
> so, on this I finished talking about all the problems, thanks for your attention!
