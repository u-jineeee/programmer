package me.programmer.level0.p120880;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6}, 4)).isEqualTo(new int[]{4, 5, 3, 6, 2, 1});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{10000,20,36,47,40,6,10,7000}, 30)).isEqualTo(new int[]{36, 40, 20, 47, 10, 6, 7000, 10000});
	}
}
