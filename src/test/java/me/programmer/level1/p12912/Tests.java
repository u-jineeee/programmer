package me.programmer.level1.p12912;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, 5)).isEqualTo(12);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(3, 3)).isEqualTo(3);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(5, 3)).isEqualTo(12);
	}
}
