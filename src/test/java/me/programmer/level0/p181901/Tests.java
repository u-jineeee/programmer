package me.programmer.level0.p181901;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(10, 3)).isEqualTo(new int[]{3, 6, 9});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(15, 5)).isEqualTo(new int[]{5, 10, 15});
	}
}
