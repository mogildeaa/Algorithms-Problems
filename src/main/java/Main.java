public class Main {

    public static void main(String[] args) {
//        missingChar("Alex", 3);



    }
    // WARMUP
    // Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    public int sumDouble(int a, int b) {
        int sum = a + b;

        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }

    // Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    // We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    public boolean parrotTrouble(boolean talking, int hour) {
        if((talking == true) && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }

    // Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }

    // Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
    public boolean nearHundred(int n) {
        return ((Math.abs(100-n) <=10) || (Math.abs(200-n) <=10));
    }

    // Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
    public boolean posNeg(int a, int b, boolean negative) {
        if(negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    // Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged.
    public String notString(String str) {
        if (str.length() >=3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    // Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    // The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);

        String back = str.substring(n+1);

        return front + back;
    }

    // Given a string, return a new string where the first and last chars have been exchanged.




}
