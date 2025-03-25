package me.programmer.level1.p12915;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"sun", "bed", "car"}, 1)).isEqualTo(new String[]{"car", "bed", "sun"});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"abce", "abcd", "cdx"}, 2)).isEqualTo(new String[]{"abcd", "abce", "cdx"});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new String[]{"cnbc", "anbcd"}, 1)).isEqualTo(new String[]{"anbcd", "cnbc"});
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution(new String[]{"edc", "abc"}, 2)).isEqualTo(new String[]{"abc", "edc"});
	}
}
