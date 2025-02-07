package me.programmer.level0.p181894;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 2, 1, 4, 5, 2, 9})).isEqualTo(new int[]{2, 1, 4, 5, 2});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{1, 2, 1})).isEqualTo(new int[]{2});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new int[]{1, 1, 1})).isEqualTo(new int[]{-1});
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1})).isEqualTo(new int[]{2, 1, 2, 1, 10, 2});
	}
}
