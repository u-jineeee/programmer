package me.programmer.level2.p42746;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test1() {
        assertThat(new Solution().solution(new int[]{6, 10, 2})).isEqualTo("6210");
    }

    @Test
    @DisplayName("example 2")
    void test2() {
        assertThat(new Solution().solution(new int[]{3, 30, 34, 5, 9})).isEqualTo("9534330");
    }
}
