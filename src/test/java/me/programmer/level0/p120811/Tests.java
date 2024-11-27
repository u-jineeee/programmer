package me.programmer.level0.p120811;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 2, 7, 10, 11})).isEqualTo(7);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{9, -1, 0})).isEqualTo(0);
	}
}
