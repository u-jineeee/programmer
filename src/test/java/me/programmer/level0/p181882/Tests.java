package me.programmer.level0.p181882;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 2, 3, 100, 99, 98})).isEqualTo(new int[]{2, 2, 6, 50, 99, 49});
	}
}
