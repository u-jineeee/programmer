package me.programmer.level0.p181922;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1},{0, 3, 2},{0, 3, 3}})).isEqualTo(new int[]{3, 2, 4, 6, 4});
	}
}
