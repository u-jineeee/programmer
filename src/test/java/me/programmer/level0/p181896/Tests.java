package me.programmer.level0.p181896;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{12, 4, 15, 46, 38, -2, 15})).isEqualTo(5);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{13, 22, 53, 24, 15, 6})).isEqualTo(-1);
	}
}
