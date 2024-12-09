package me.programmer.level0.p181884;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{34, 5, 71, 29, 100, 34}, 123)).isEqualTo(139);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{58, 44, 27, 10, 100}, 139)).isEqualTo(239);
	}
}
