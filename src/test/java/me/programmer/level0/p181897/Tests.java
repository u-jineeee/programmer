package me.programmer.level0.p181897;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(new int[]{2, 3, 4, 5, 6});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(new int[]{2, 4, 6});
	}
}
