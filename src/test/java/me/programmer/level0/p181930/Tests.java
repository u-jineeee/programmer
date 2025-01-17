package me.programmer.level0.p181930;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(2, 6, 1)).isEqualTo(9);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(5, 3, 3)).isEqualTo(473);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(4, 4, 4)).isEqualTo(110592);
	}
}
