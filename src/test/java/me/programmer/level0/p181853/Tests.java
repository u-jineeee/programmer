package me.programmer.level0.p181853;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{12, 4, 15, 46, 38, 1, 14})).isEqualTo(new int[]{1, 4, 12, 14, 15});
	}
}