package me.programmer.level0.p181899;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(10, 3)).isEqualTo(new int[]{10, 9, 8, 7, 6, 5, 4, 3});
	}
}
