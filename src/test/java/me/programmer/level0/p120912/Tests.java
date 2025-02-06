package me.programmer.level0.p120912;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{7, 77, 17})).isEqualTo(4);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{10, 29})).isEqualTo(0);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new int[]{777, 77, 77, 1, 2, 3, 4, 5, 6, 7})).isEqualTo(8);
	}
}
