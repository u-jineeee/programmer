package me.programmer.level2.p87390;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, 2, 5)).isEqualTo(new int[]{3,2,2,3});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(4, 7, 14)).isEqualTo(new int[]{4,3,3,3,4,4,4,4});
	}
}
