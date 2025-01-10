package me.programmer.level0.p120844;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 2, 3}, "right")).isEqualTo(new int[]{3, 1, 2});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")).isEqualTo(new int[]{455, 6, 4, -1, 45, 6, 4});
	}
}
