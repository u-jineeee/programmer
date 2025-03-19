package me.programmer.level0.p181865;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("43 + 12")).isEqualTo(55);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("0 - 7777")).isEqualTo(-7777);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("40000 * 40000")).isEqualTo(1600000000);
	}
}
