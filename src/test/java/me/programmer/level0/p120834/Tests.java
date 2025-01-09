package me.programmer.level0.p120834;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(23)).isEqualTo("cd");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(51)).isEqualTo("fb");
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(100)).isEqualTo("baa");
	}
}
