package com.dhanesh;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    @Test
    void containsDuplicate(){
        assertAll(
                () -> assertThat(containsDuplicate.containsDuplicate(new int[]{1,2,3,1})).isTrue(),
                () -> assertThat(containsDuplicate.containsDuplicate(new int[]{1,2,3,4})).isFalse(),
                () -> assertThat(containsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2})).isTrue()
        );
    }


}