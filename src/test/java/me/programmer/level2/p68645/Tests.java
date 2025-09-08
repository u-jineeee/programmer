package me.programmer.level2.p68645;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(4)).isEqualTo(new int[]{1,2,9,3,10,8,4,5,6,7});
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(5)).isEqualTo(new int[]{1,2,12,3,13,11,4,14,15,10,5,6,7,8,9});
    }

    @Test
    @DisplayName("example 3")
    void test003() {
        assertThat(new Solution().solution(6)).isEqualTo(new int[]{1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11});
    }
}
