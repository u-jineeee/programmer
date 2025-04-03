package me.programmer.level1.p133502;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1})).isEqualTo(2);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2})).isEqualTo(0);
	}
}
