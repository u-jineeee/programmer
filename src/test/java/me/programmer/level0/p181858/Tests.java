package me.programmer.level0.p181858;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{0, 1, 1, 2, 2, 3}, 3)).isEqualTo(new int[]{0, 1, 2});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{0, 1, 1, 1, 1}, 4)).isEqualTo(new int[]{0, 1, -1, -1});
	}
}
