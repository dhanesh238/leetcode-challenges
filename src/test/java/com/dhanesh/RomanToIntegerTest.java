package com.dhanesh;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();
    @Test
    void romanToInt() {
        assertAll(
            () -> assertThat(romanToInteger.romanToInt("III"))
                    .isEqualTo(3),
            () -> assertThat(romanToInteger.romanToInt("LVIII"))
                    .isEqualTo(58),
            () -> assertThat(romanToInteger.romanToInt("MCMXCIV"))
                    .isEqualTo(1994)
        );
    }
}