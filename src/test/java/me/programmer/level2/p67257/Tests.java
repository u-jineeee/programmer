package me.programmer.level2.p67257;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution("100-200*300-500+20")).isEqualTo(60420);
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution("50*6-3*2")).isEqualTo(300);
    }
}
