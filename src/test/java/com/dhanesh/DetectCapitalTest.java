package com.dhanesh;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {

    DetectCapital detectCapital = new DetectCapital();
    @Test
    void detectCapitalUse() {
        assertAll(
                () -> assertThat(detectCapital.detectCapitalUse("USA")).isTrue(),
                () -> assertThat(detectCapital.detectCapitalUse("FlaG")).isFalse()
        );
    }
}