package me.programmer.level2.p12899;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001(){
        assertThat(new Solution().solution(1)).isEqualTo("1");
    }

    @Test
    @DisplayName("example 2")
    void test002(){
        assertThat(new Solution().solution(2)).isEqualTo("2");
    }

    @Test
    @DisplayName("example 3")
    void test003(){
        assertThat(new Solution().solution(3)).isEqualTo("4");
    }

    @Test
    @DisplayName("example 4")
    void test004(){
        assertThat(new Solution().solution(4)).isEqualTo("11");
    }
}
