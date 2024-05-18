package com.dhanesh;

// 13. Roman to Integer
// https://leetcode.com/problems/roman-to-integer/description/

import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        // Create a map of Roman to Int mapping
        Map<Character, Integer> roman = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);
        for (int index = 0; index < s.length(); index++) {
            // For roman if value is lesser than next value, then do subtraction
            if (index + 1 < s.length() &&
                    roman.get(s.charAt(index)) < roman.get(s.charAt(index + 1))) {
                result -= roman.get(s.charAt(index));
            } else {
                result += roman.get(s.charAt(index));
            }
        }
        return result;
    }
}
