package me.programmer.level2.p148653;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(16)).isEqualTo(6);
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(2554)).isEqualTo(16);
    }
}
