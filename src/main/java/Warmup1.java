import java.util.Scanner;

public class Warmup1 {

    public static void main(String[] args) {

        W3resource x = new W3resource();

//        missingChar("Alex", 3);
//        frontBack("Alex");
//        x.makeMultiplication();
//        System.out.println(x.digitSum(1238));
//        System.out.println(x.reverseString("Alex"));
//        x.checkPalindrom("JavaA");
//        x.countChars("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
//        x.count3digitNumbers();
//        x.turnFirstDigitToUpper();
//        System.out.println("Numarul este prim - " + x.isPrime(29));


    }

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
        if ((talking == true) && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }

    // Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    // Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    // Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    // Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged.
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    // Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    // The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);

        String back = str.substring(n + 1);

        return front + back;
    }

    // Given a string, return a new string where the first and last chars have been exchanged.
    public static String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);

        System.out.println(str.charAt(str.length() - 1) + mid + str.charAt(0));
        return "";
    }

    //Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
    public String front3(String str) {

        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        return front + front + front;
    }

    // Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
    // The original string will be length 1 or more.
    public String backAround(String str) {

        String lastChar = str.substring(str.length() - 1);

        return lastChar + str + lastChar;
    }

    //Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    // Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
    // If the string length is less than 2, use whatever chars are there.
    public String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }

    // Given a string, return true if the string starts with "hi" and false otherwise.
    public boolean startHi(String str) {
        if (str.length() < 2) return false;

        String firstTwo = str.substring(0, 2);

        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)) {
            return true;
        } else {
            return false;
        }
    }

    //Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
    }

    //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    // Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
    // Otherwise, return the string unchanged.
    public String delDel(String str) {

        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    //Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
    public boolean mixStart(String str) {
        if (str.length() >= 3) {
            return (str.substring(1, 3).equals("ix"));
        } else {
            return false;
        }
    }

    // Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o'
    // and include the second only if it is 'z', so "ozymandias" yields "oz".
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    //Given three int values, a b c, return the largest.
    public int intMax(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        return max;
    }

    //Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }

        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

    //Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
    public boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40) && (b >= 30 && b <= 40) ||
                (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
    }

    //Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
    public int max1020(int a, int b) {

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    //Return true if the given string contains between 1 and 3 'e' chars.
    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }
        return (count >= 1 && count <= 3);
    }

    //Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    //Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there.
    public String endUp(String str) {

        if (str.length() <= 3) {
            return str.toUpperCase();
        }

        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);

        return front + back.toUpperCase();
    }

    //Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
    //So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
    public String everyNth(String str, int n) {

        String result = "";

        for (int i = 0; i < str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }


}
