package me.programmer.level0.p181861;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{5, 1, 4})).isEqualTo(new int[]{5, 5, 5, 5, 5, 1, 4, 4, 4, 4});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{6, 6})).isEqualTo(new int[]{6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new int[]{1})).isEqualTo(new int[]{1});
	}
}
