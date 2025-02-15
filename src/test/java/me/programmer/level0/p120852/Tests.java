package me.programmer.level0.p120852;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(12)).isEqualTo(new int[]{2,3});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(17)).isEqualTo(new int[]{17});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(420)).isEqualTo(new int[]{2, 3, 5, 7});
	}
}
