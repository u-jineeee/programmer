package me.programmer.level2.p84512;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("AAAAE")).isEqualTo(6);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("AAAE")).isEqualTo(10);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("I")).isEqualTo(1563);
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution("EIO")).isEqualTo(1189);
	}
}
