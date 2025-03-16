package me.programmer.level0.p120923;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, 12)).isEqualTo(new int[]{3, 4, 5});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(5, 15)).isEqualTo(new int[]{1, 2, 3, 4, 5});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(4,  14)).isEqualTo(new int[]{2, 3, 4, 5});
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution(5, 5)).isEqualTo(new int[]{-1, 0, 1, 2, 3});
	}

	@Test
	@DisplayName("example 5")
	void test005() {
		assertThat(new Solution().solution(3, 0)).isEqualTo(new int[]{-1, 0, 1});
	}
}
