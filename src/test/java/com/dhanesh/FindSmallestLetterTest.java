package com.dhanesh;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindSmallestLetterTest {

    FindSmallestLetter findSmallestLetter = new FindSmallestLetter();

    @Test
    void nextGreatestLetter() {
        assertAll(
                () -> assertThat(findSmallestLetter.nextGreatestLetter(new char[]{'c','f','j'},'a'))
                        .isEqualTo('c'),
                () -> assertThat(findSmallestLetter.nextGreatestLetter(new char[]{'x','x','y','y'},'z'))
                        .isEqualTo('x')
        );
    }
}