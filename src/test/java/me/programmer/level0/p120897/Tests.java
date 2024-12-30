package me.programmer.level0.p120897;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(24)).isEqualTo(new int[]{1, 2, 3, 4, 6, 8, 12, 24});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(29)).isEqualTo(new int[]{1, 29});
	}
}
