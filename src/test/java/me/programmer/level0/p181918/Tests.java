package me.programmer.level0.p181918;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 4, 2, 5, 3})).isEqualTo(new int[]{1, 2, 3});
	}
}
