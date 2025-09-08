package me.programmer.level2.p118667;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1})).isEqualTo(2);
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2})).isEqualTo(7);
    }

    @Test
    @DisplayName("example 3")
    void test003() {
        assertThat(new Solution().solution(new int[]{1, 1}, new int[]{1, 5})).isEqualTo(-1);
    }
}
