package me.programmer.level0.p181934;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("exmaple 1")
	void test001() {
		assertThat(new Solution().solution("<", "=", 20,	50)).isEqualTo(1);
	}

	@Test
	@DisplayName("exmaple 2")
	void test002() {
		assertThat(new Solution().solution(">", "!", 41,	78)).isEqualTo(0);
	}
}
