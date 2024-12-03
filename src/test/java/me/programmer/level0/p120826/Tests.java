package me.programmer.level0.p120826;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("abcdef", "f")).isEqualTo("abcde");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("BCBdbe", "B")).isEqualTo("Cdbe");
	}
}
