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
