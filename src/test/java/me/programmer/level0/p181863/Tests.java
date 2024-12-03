package me.programmer.level0.p181863;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("masterpiece")).isEqualTo("rnasterpiece");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("programmers")).isEqualTo("prograrnrners");
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("jerry")).isEqualTo("jerry");
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution("burn")).isEqualTo("burn");
	}
}
