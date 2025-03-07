package me.programmer.level0.p120861;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})).isEqualTo(new int[]{2, 1});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})).isEqualTo(new int[]{0, -4});
	}
}
