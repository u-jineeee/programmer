package me.programmer.level2.p68936;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(new int[][]{{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}})).isEqualTo(new int[]{4, 9});
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(new int[][]{{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}}))
        .isEqualTo(new int[]{10,15});
    }
}
