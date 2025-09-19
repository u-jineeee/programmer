package me.programmer.level2.p17683;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001(){
        assertThat(new Solution().solution("ABCDEFG", new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"})).isEqualTo("HELLO");
    }

    @Test
    @DisplayName("example 2")
    void test002(){
        assertThat(new Solution().solution("CC#BCC#BCC#BCC#B", new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"})).isEqualTo("FOO");
    }

    @Test
    @DisplayName("example 3")
    void test003(){
        assertThat(new Solution().solution("ABC", new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"})).isEqualTo("WORLD");
    }
}
