package me.programmer.level0.p181839;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, 5)).isEqualTo(34);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(6, 1)).isEqualTo(14);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(2, 4)).isEqualTo(2);
	}
}
