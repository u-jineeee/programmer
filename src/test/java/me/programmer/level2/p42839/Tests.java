package me.programmer.level2.p42839;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution("17")).isEqualTo(3);
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution("011")).isEqualTo(2);
    }
}
