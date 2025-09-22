package me.programmer.level2.p154540;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(new String[]{"X591X","X1X5X","X231X", "1XXX1"})).isEqualTo(new int[]{1, 1, 27});
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(new String[]{"XXX","XXX","XXX"})).isEqualTo(new int[]{-1});
    }
}
