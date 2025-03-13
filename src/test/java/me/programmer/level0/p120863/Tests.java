package me.programmer.level0.p120863;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("3x + 7 + x")).isEqualTo("4x + 7");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("x + x + x")).isEqualTo("3x");
	}
}
