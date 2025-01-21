package me.programmer.level0.p120842;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)).isEqualTo(new int[][] {{1, 2}, {3, 4}, {5, 6}, {7, 8}});
	}
}
