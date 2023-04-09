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
