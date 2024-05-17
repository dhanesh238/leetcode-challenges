package com.dhanesh;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void isPalindrome_PositiveSuccess() {
        assertAll(
                () -> assertThat(palindromeNumber.isPalindrome(121))
                        .isTrue(),
                () -> assertThat(palindromeNumber.isPalindrome(-121))
                        .isFalse(),
                () -> assertThat(palindromeNumber.isPalindrome(10))
                        .isFalse()
        );
    }
}