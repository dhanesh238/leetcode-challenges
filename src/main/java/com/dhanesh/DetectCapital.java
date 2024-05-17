package com.dhanesh;// 520. Detect Capital
// https://leetcode.com/problems/detect-capital/

/**
* Input: word = "USA"
* Output: true
* Input: word = "FlaG"
* Output: false
*/
class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())){
            return true;
        } else if(word.equals(word.substring(0,1).toUpperCase()+
                word.substring(1).toLowerCase())){
            return true;
        }
        return false;
    }
}
