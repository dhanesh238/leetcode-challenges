package com.dhanesh;
// 214. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
import java.util.Set;

/**
 * Time O(n) - Iterating only once
 * Space O(n) - Create a set of size n
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> inputSet = new HashSet<>();
        for(int each : nums){
            // Check if entry present in hashset, then return true
            if(inputSet.contains(each)){
                return true;
            }
            // Else, add if not present
            inputSet.add(each);
        }
        return false;
    }
}
