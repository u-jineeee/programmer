package me.programmer.level0.p181900;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3})).isEqualTo("programmers");
	}
}
