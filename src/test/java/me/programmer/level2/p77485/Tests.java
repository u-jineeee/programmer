package me.programmer.level2.p77485;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(6, 6, new int[][]{{2,2,5,4},{3,3,6,6},{5,1,6,3}})).isEqualTo(new int[]{8, 10, 25});
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(3, 3, new int[][]{{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}})).isEqualTo(new int[]{1, 1, 5, 3});
    }

    @Test
    @DisplayName("example 3")
    void test003() {
        assertThat(new Solution().solution(100, 97, new int[][]{{1,1,100,97}})).isEqualTo(new int[]{1});
    }
}
