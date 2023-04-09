public class Problem3 {
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
