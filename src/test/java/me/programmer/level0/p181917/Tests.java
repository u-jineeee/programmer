package me.programmer.level0.p181917;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(false, true, true, true)).isEqualTo(true);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(true, false, false, false)).isEqualTo(false);
	}
}
