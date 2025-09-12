package me.programmer.level2.p159993;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(new String[]{"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"})).isEqualTo(16);
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(new String[]{"LOOXS","OOOOX","OOOOO","OOOOO","EOOOO"})).isEqualTo(-1);
    }
}
