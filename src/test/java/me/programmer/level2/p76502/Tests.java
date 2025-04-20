package me.programmer.level2.p76502;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("[](){}")).isEqualTo(3);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("}]()[{")).isEqualTo(2);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("[)(]")).isEqualTo(0);
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution("}}}")).isEqualTo(0);
	}
}
