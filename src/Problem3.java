public class Problem3 {
    public static String getPrimeComposite(int n){
        if (n <= 1) {
            return "composite";
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "composite";
            }
        }

        return "prime";
    }
}
