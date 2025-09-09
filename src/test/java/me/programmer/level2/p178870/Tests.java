package me.programmer.level2.p178870;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5}, 7)).isEqualTo(new int[]{2, 3});
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5)).isEqualTo(new int[]{6, 6});
    }

    @Test
    @DisplayName("example 3")
    void test003() {
        assertThat(new Solution().solution(new int[]{2, 2, 2, 2, 2}, 6)).isEqualTo(new int[]{0, 2});
    }
}
