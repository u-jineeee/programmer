package me.programmer.level0.p181841;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"abc", "def", "ghi"}, "ef")).isEqualTo("abcghi");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"abc", "bbc", "cbc"}, "c")).isEqualTo("");
	}
}
