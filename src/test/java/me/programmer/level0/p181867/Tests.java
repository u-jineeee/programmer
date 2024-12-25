package me.programmer.level0.p181867;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("oxooxoxxox")).isEqualTo(new int[]{1, 2, 1, 0, 1, 0});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("xabcxdefxghi")).isEqualTo(new int[]{0, 3, 3, 3});
	}
}
