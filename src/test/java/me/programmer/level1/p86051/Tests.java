package me.programmer.level1.p86051;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1,2,3,4,6,7,8,0})).isEqualTo(14);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{5,8,4,0,6,7,9})).isEqualTo(6);
	}
}
