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
