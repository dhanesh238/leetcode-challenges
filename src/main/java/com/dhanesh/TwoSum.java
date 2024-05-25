package com.dhanesh;

// 01. Two Sum
// https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
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
