
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanValue(currentChar);

            if (i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                int nextValue = romanValue(nextChar);

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static int romanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Roman Number");
        Scanner sc=new Scanner(System.in);
        String romanNumeral=sc.nextLine();
        int result = romanToInteger(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to integer " + result);
    }
}
