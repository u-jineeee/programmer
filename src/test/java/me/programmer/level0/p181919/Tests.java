package me.programmer.level0.p181919;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(10)).isEqualTo(new int[]{10, 5, 16, 8, 4, 2, 1});
	}
}
