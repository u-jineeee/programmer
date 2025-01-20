package me.programmer.level0.p181931;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, 4, new boolean[]{true, false, false, true, true})).isEqualTo(37);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(7, 1, new boolean[]{false, false, false, true, false, false, false})).isEqualTo(10);
	}
}
