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
