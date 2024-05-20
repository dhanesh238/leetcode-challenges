package com.dhanesh;

// 14. Longest common prefix
// https://leetcode.com/problems/longest-common-prefix/description/

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        // Iterate with index
        for(int i = 0; i< strs[0].length(); i++) {
            // Iterate over the string array
            for(String eachStr : strs) {
                // Check if character is same
                if(i==eachStr.length() || eachStr.charAt(i) != strs[0].charAt(i)){
                    return result.toString();
                }
            }
            result.append(strs[0].charAt(i));
        }
        return result.toString();
    }
}
