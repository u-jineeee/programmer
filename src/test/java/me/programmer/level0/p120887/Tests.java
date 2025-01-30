package me.programmer.level0.p120887;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(1, 13, 1)).isEqualTo(6);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(10, 50, 5)).isEqualTo(5);
	}

	@Test
	@DisplayName("example 3")
	void test0030() {
		assertThat(new Solution().solution(3, 10, 2)).isEqualTo(0);
	}
}
