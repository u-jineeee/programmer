package me.programmer.level0.p120854;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"We", "are", "the", "world!"})).isEqualTo(new int[] {2, 3, 3, 6});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"I", "Love", "Programmers."})).isEqualTo(new int[] {1, 4, 12});
	}
}
