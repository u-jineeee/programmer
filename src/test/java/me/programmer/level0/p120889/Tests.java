package me.programmer.level0.p120889;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 2, 3})).isEqualTo(2);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{3, 6, 2})).isEqualTo(2);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new int[]{199, 72, 222})).isEqualTo(1);
	}
}
