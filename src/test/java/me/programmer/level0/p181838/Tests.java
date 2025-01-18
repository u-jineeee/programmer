package me.programmer.level0.p181838;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29})).isEqualTo(1);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{1024, 10, 24}, new int[]{1024, 10, 24})).isEqualTo(0);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new int[]{10000, 12, 15}, new int[]{0, 12, 17})).isEqualTo(0);
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution(new int[]{2022, 3, 29}, new int[]{2022, 4, 1})).isEqualTo(1);
	}
}
