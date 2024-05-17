package com.dhanesh;// 744. Find Smallest Letter Greater Than Target
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

import java.util.Arrays;

/**
* Input: letters = ["c","f","j"], target = "a"
* Output: "c"
* Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
* Input: letters = ["x","x","y","y"], target = "z"
* Output: "x"
* Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
*/
class FindSmallestNumber {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        for(char eachLetter : letters) {
            if(eachLetter > target) {
                return eachLetter;
            }
        }
        return letters[0];
    }
}
