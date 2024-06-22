package com.dhanesh;

import java.util.*;

// 01. Two Sum
// https://leetcode.com/problems/two-sum/description/
public class TwoSum {

    // Time O(n)
    // Space O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            // Take eachNum check if (sum - eachNum) exists in HashMap
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            // Else add to HashMap
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }

    public int[] twoSumBruteForce(int[] nums, int target) {
        // Time O(n2)
        int[] result = new int[2];
        for (int i = 0; (i < nums.length - 1); i++) {
            for (int j = 1; (j < nums.length); j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
            if (result[1] != 0) {
                break;
            }
        }
        return result;
    }
}
