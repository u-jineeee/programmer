package me.programmer.level2.p155651;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}}))
                .isEqualTo(3);
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(new String[][]{{"09:10", "10:10"}, {"10:20", "12:20"}}))
                .isEqualTo(1);
    }

    @Test
    @DisplayName("example 3")
    void test003() {
        assertThat(new Solution().solution(new String[][]{{"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}}))
                .isEqualTo(3);
    }
}
