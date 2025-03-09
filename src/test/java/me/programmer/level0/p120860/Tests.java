package me.programmer.level0.p120860;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}})).isEqualTo(1);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}})).isEqualTo(4);
	}
}
