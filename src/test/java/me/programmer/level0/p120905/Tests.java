package me.programmer.level0.p120905;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})).isEqualTo(new int[]{6, 9, 12});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(5, new int[]{1, 9, 3, 10, 13, 5})).isEqualTo(new int[]{10, 5});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(12, new int[]{2, 100, 120, 600, 12, 12})).isEqualTo(new int[]{120, 600, 12, 12});
	}
}
