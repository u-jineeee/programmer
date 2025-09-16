package me.programmer.level2.p72411;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001(){
        assertThat(new Solution().solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2,3,4})).isEqualTo(new String[]{"AC", "ACDE", "BCFG", "CDE"});
    }

    @Test
    @DisplayName("example 2")
    void test002(){
        assertThat(new Solution().solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2,3,5})).isEqualTo(new String[]{"ACD", "AD", "ADE", "CD", "XYZ"});
    }

    @Test
    @DisplayName("example 3")
    void test003(){
        assertThat(new Solution().solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2,3,4})).isEqualTo(new String[]{"WX", "XY"});
    }
}

