package me.programmer.level1.p42862;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(5, new int[]{2, 4}, new int[]{1, 3, 5})).isEqualTo(5);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(5, new int[]{2, 4}, new int[]{3})).isEqualTo(4);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(3, new int[]{3}, new int[]{1})).isEqualTo(2);
	}
}
