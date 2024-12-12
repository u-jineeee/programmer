package me.programmer.level0.p181891;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{2, 1, 6}, 1)).isEqualTo(new int[]{1, 6, 2});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{5, 2, 1, 7, 5}, 3)).isEqualTo(new int[]{7, 5, 5, 2, 1});
	}
}
