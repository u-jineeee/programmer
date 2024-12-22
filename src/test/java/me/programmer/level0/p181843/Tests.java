package me.programmer.level0.p181843;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("banana", "ana")).isEqualTo(1);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("banana", "wxyz")).isEqualTo(0);
	}
}
