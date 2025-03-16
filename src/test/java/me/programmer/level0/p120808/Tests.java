package me.programmer.level0.p120808;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(1, 2, 3, 4)).isEqualTo(new int[]{5, 4});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(9, 2, 1, 3)).isEqualTo(new int[]{29, 6});
	}
}
