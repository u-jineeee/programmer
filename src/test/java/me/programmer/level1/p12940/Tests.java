package me.programmer.level1.p12940;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, 12)).isEqualTo(new int[]{3, 12});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(2, 5)).isEqualTo(new int[]{1, 10});
	}
}
