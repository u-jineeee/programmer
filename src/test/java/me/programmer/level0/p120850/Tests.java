package me.programmer.level0.p120850;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("hi12392")).isEqualTo(new int[]{1, 2, 2, 3, 9});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("p2o4i8gj2")).isEqualTo(new int[]{2, 2, 4, 8});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("abcde0")).isEqualTo(new int[]{0});
	}
}
