package me.programmer.level0.p120911;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("Bcad")).isEqualTo("abcd");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("heLLo")).isEqualTo("ehllo");
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("Python")).isEqualTo("hnopty");
	}
}
