package me.programmer.level2.p42883;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution("1924", 2)).isEqualTo("94");
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution("1231234", 3)).isEqualTo("3234");
    }

    @Test
    @DisplayName("example 3")
    void test003() {
        assertThat(new Solution().solution("4177252841", 4)).isEqualTo("775841");
    }
}
