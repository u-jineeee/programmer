package me.programmer.level1.p250137;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{5, 1, 5}, 30, new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}})).isEqualTo(5);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}})).isEqualTo(-1);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new int[]{4, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}})).isEqualTo(-1);
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution(new int[]{1, 1, 1}, 5, new int[][]{{1, 2}, {3, 2}})).isEqualTo(3);
	}


	@Test
	@DisplayName("example 5")
	void test005() {
		assertThat(new Solution().solution(new int[]{2, 4, 4}, 20, new int[][]{{1, 10}, {2, 9}, {6, 16}})).isEqualTo(1);
	}
}
