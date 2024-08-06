package online;

import java.util.Scanner;

public class AlphabetPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        boolean isPalindrome = checkPalindrome(s);
        System.out.println(isPalindrome);
        in.close();
    }
    public static boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
