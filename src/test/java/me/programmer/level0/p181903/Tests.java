package me.programmer.level0.p181903;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, 1, "qjnwezgrpirldywt")).isEqualTo("jerry");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(1, 0, "programmers")).isEqualTo("programmers");
	}
}
