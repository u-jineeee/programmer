package me.programmer.level2.p169199;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001(){
        assertThat(new Solution().solution(new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."})).isEqualTo(7);
    }

    @Test
    @DisplayName("example 2")
    void test002(){
        assertThat(new Solution().solution(new String[]{".D.R", "....", ".G..", "...D"})).isEqualTo(-1);
    }
}
