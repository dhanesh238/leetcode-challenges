package com.dhanesh;
// 09. Palindrome Number
// https://leetcode.com/problems/palindrome-number/description/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        long value = x;

        if (value < 0) {
            return false;
        }
        if (value < 10) {
            return true;
        }

        long divisor = 1;
        //while (x >= (divisor * 10)) {
        while (Math.abs(value) >= (divisor * 10)) {
            divisor = divisor * 10; // Find the divisor, if 121 then 100; if 1331 then 1000 and so on
        }
        System.out.println("Divisor is: " + divisor);

        while (value > 0) {
            if (value / divisor != value % 10) {
                return false;
            }
            value = (value % divisor) / 10; // Remove left and right
            divisor = divisor / 100; // Reduce divisor by 100 as 2 digits are removed
        }
        return true;
    }
}