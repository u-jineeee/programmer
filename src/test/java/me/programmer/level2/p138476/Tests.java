package me.programmer.level2.p138476;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3})).isEqualTo(3);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3})).isEqualTo(2);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3})).isEqualTo(1);
	}
}
