package me.programmer.level0.p120819;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(5500)).isEqualTo(new int[]{1,0});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(15000)).isEqualTo(new int[]{2,4000});
	}
}
