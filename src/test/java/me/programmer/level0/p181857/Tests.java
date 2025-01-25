package me.programmer.level0.p181857;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6})).isEqualTo(new int[]{1, 2, 3, 4, 5, 6, 0, 0});
	}

	@Test
	@DisplayName("example 2")
	 void test002() {
		assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6})).isEqualTo(new int[]{1, 2, 3, 4, 5, 6, 0, 0});
	}
}
