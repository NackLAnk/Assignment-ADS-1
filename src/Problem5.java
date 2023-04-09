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
