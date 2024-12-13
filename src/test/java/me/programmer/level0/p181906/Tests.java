package me.programmer.level0.p181906;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("banana", "ban")).isEqualTo(1);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("banana", "nan")).isEqualTo(0);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("banana", "abcd")).isEqualTo(0);
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution("banana", "bananan")).isEqualTo(0);
	}
}
