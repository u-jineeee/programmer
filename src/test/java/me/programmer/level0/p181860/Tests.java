package me.programmer.level0.p181860;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false})).isEqualTo(new int[]{3, 3, 3, 3, 4, 4, 4, 4});
	}
}
