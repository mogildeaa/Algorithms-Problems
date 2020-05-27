public class Warmup2 {

    //Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    public String stringTimes(String str, int n) {

        String result = "";

        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    //Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string
    // is less than length 3. Return n copies of the front;
    public String frontTimes(String str, int n) {

        int frontLen = 3;

        if (frontLen > str.length()) {
            frontLen = str.length();
        }

        String result = "";
        String front = str.substring(0, frontLen);

        for (int i = 0; i < n; i++) {
            result = result + front;
        }
        return result;
    }

    //Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    int countXX(String str) {

        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) counter++;
        }
        return counter;
    }

    //Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    boolean doubleX(String str) {
        int i = str.indexOf("x");

        if (i == -1) return false; // no "x" at all

        if (i + 1 >= str.length()) return false; // check i+1 in bounds

        return str.substring(i + 1, i + 2).equals("x");
    }

    //Given a non-empty string like "Code" return a string like "CCoCodCode".
    public String stringSplosion(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }

    //Given a string, return the count of the number of times that a substring length 2 appears in the string and
    //also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
    public int last2(String str) {

        if (str.length() < 2) return 0;

        String end = str.substring(str.length() - 2);

        int count = 0;

        // Check each substring length 2 starting at i
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }

}
