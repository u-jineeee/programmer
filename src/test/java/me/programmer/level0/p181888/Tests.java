package me.programmer.level0.p181888;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{4, 2, 6, 1, 7, 6}, 2)).isEqualTo(new int[]{4, 6, 7});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{4, 2, 6, 1, 7, 6}, 4)).isEqualTo(new int[]{4, 7});
	}
}
