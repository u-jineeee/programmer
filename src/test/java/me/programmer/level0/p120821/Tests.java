package me.programmer.level0.p120821;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{5, 4, 3, 2, 1});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{1, 1, 1, 1, 1, 2})).isEqualTo(new int[]{2, 1, 1, 1, 1, 1});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new int[]{1, 0, 1, 1, 1, 3, 5})).isEqualTo(new int[]{5, 3, 1, 1, 1, 0, 1});
	}
}
