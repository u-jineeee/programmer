package me.programmer.level0.p120899;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 8, 3})).isEqualTo(new int[]{8, 1});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{9, 10, 11, 8})).isEqualTo(new int[]{11, 2});
	}
}
