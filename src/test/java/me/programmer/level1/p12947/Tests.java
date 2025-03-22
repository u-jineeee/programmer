package me.programmer.level1.p12947;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(10)).isEqualTo(true);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(12)).isEqualTo(true);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(11)).isEqualTo(false);
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution(13)).isEqualTo(false);
	}
}
