package me.programmer.level0.p181887;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{4, 2, 6, 1, 7, 6})).isEqualTo(17);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{-1, 2, 5, 6, 3})).isEqualTo(8);
	}
}
