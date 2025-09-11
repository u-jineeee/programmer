package me.programmer.level2.p135807;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(new int[]{10, 17}, new int[]{5, 20})).isEqualTo(0);
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(new int[]{10, 20}, new int[]{5, 17})).isEqualTo(10);
    }

    @Test
    @DisplayName("example 3")
    void test003() {
        assertThat(new Solution().solution(new int[]{14, 35, 119}, new int[]{18, 30, 102})).isEqualTo(7);
    }
}
