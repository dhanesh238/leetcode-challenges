package com.dhanesh;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    TwoSum twoSum = new TwoSum();
    @Test
    void twoSum() {
        assertAll(
                () -> assertThat(twoSum.twoSum(new int[]{2,7,11,15}, 9))
                        .isEqualTo(new int[]{0,1}),
                () -> assertThat(twoSum.twoSum(new int[]{3,2,4}, 6))
                        .isEqualTo(new int[]{1,2}),
                () -> assertThat(twoSum.twoSum(new int[]{3,3}, 6))
                        .isEqualTo(new int[]{0,1})

        );
    }
}