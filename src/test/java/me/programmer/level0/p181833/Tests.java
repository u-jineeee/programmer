package me.programmer.level0.p181833;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3)).isEqualTo(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(6)).isEqualTo(new int[][]{{1, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 1}});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(1)).isEqualTo(new int[][]{{1}});
	}
}
