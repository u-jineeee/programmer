package me.programmer.level2.p142085;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.elasticsearch.DataElasticsearchTest;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("example 1")
    void test001() {
        assertThat(new Solution().solution(7, 3, new int[]{4, 2, 4, 5, 3, 3, 1})).isEqualTo(5);
    }

    @Test
    @DisplayName("example 2")
    void test002() {
        assertThat(new Solution().solution(2, 4, new int[]{3, 3, 3, 3})).isEqualTo(4);
    }
}
