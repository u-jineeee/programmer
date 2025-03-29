package me.programmer.level1.p42840;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1,2,3,4,5})).isEqualTo(new int[]{1});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{1,3,2,4,2})).isEqualTo(new int[]{1,2,3});
	}
}
