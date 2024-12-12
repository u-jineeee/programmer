package me.programmer.level0.p181892;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{2, 1, 6}, 3)).isEqualTo(new int[]{6});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{5, 2, 1, 7, 5}, 2)).isEqualTo(new int[]{2, 1, 7, 5});
	}
}
