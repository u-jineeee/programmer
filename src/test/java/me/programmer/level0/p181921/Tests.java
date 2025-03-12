package me.programmer.level0.p181921;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(5, 555)).isEqualTo(new int[]{5, 50, 55, 500, 505, 550, 555});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(10, 20)).isEqualTo(new int[]{-1});
	}
}
