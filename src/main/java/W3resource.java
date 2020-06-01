import java.util.Scanner;

public class W3resource {

    //Write a Java program that takes a number as input and prints its multiplication table upto 10
    public void makeMultiplication() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = in.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + "*" + i + " = " + (n * i));
        }
    }

    //Write a Java program and compute the sum of the digits of an integer
    public int digitSum(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    //Write a Java program to reverse a string
    public String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    //Write a Java program to check if a given string is palindrom
    public String checkPalindrom(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        if (str.equals(result)) {
            System.out.println(str + " este palindrom");
        } else {
            System.out.println(str + " nu este palindrom");
        }
        return "";
    }

    //Write a Java program to count the letters, spaces, numbers and other characters of an input string.
    public static void countChars(String str) {
        char[] ch = str.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else {
                other++;
            }
        }
        System.out.println("The given sentence have : ");
        System.out.println("Letters: " + letter);
        System.out.println("Spaces: " + space);
        System.out.println("Numbers: " + num);
        System.out.println("Others: " + other);
    }

    //Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
    public static void count3digitNumbers() {
        int amount = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + amount);
    }

    //Write a Java program to capitalize the first letter of each word in a sentence
    public static void turnFirstDigitToUpper() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();
        String upperCaseLine = "";
        Scanner lineScan = new Scanner(line);
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upperCaseLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upperCaseLine.trim());
    }
}














