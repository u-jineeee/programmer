package me.programmer.level0.p120835;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{3, 76, 24})).isEqualTo(new int[]{3, 1, 2});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7})).isEqualTo(new int[]{7, 6, 5, 4, 3, 2, 1});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new int[]{30, 10, 23, 6, 100})).isEqualTo(new int[]{2, 4, 3, 5, 1});
	}
}