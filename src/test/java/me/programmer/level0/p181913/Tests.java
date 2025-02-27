package me.programmer.level0.p181913;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}})).isEqualTo("programmers");
	}
}
