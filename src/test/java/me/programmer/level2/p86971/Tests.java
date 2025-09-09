package me.programmer.level2.p86971;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(9, new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}})).isEqualTo(3);
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(4, new int[][]{{1,2},{2,3},{3,4}})).isEqualTo(0);
    }

    @Test
    @DisplayName("example 3")
    void test003() {
        assertThat(new Solution().solution(7, new int[][]{{1,2},{2,3},{3,4}})).isEqualTo(1);
    }
}
