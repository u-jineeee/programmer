package me.programmer.level0.p120910;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(2, 10)).isEqualTo(2048);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(7, 15)).isEqualTo(229376);
	}
}
