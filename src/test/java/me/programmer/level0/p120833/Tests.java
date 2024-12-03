package me.programmer.level0.p120833;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5}, 1, 3)).isEqualTo(new int[]{2, 3, 4});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{1, 3, 5}, 1, 2)).isEqualTo(new int[]{3, 5});
	}
}
