package me.programmer.level0.p120862;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 2, -3, 4, -5})).isEqualTo(15);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{0, -31, 24, 10, 1, 9})).isEqualTo(240);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new int[]{10, 20, 30, 5, 5, 20, 5})).isEqualTo(60);
	}
}
