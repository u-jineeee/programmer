package me.programmer.level2.p42583;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(2, 10, new int[]{7, 4, 5, 6})).isEqualTo(8);
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(100, 100, new int[]{10})).isEqualTo(101);
    }

    @Test
    @DisplayName("example 3")
    void test003() {
        assertThat(new Solution().solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10})).isEqualTo(110);
    }
}
