package com.dhanesh;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        assertAll(
                () -> assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}))
                        .isEqualTo("fl"),
                () -> assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}))
                        .isEqualTo("")
        );
    }
}