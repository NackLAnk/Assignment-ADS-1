public class Problem9 {
    // This method returns the binomial coefficient C(n,k) using recursion
    public static int getCoefficient(int n, int k) {
        if (k == 0 || k == n) { // checks if there is 0 here or if the answers do not match
            return 1;
        }
        return getCoefficient(n-1, k-1) + getCoefficient(n-1, k); // Recursive case
    }
}
