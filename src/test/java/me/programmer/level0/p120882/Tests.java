package me.programmer.level0.p120882;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})).isEqualTo(new int[]{1, 2, 4, 3});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})).isEqualTo(new int[]{4, 4, 6, 2, 2, 1, 7});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new int[][]{{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {1, 1}})).isEqualTo(new int[]{3, 3, 1, 1, 5, 6});
	}
}
