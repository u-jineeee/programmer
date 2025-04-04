package me.programmer.level1.p64061;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4})).isEqualTo(4);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[][]{{1, 0, 0, 0, 0}, {2, 0, 0, 0, 0}, {2, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {3, 0, 0, 0, 0}}, new int[]{1,1,1,1})).isEqualTo(4);
	}
}
