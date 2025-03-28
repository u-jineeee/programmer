package me.programmer.level1.p136798;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(5,3, 2)).isEqualTo(10);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(10, 3, 2)).isEqualTo(21);
	}
}
