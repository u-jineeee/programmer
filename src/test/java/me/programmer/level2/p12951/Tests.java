package me.programmer.level2.p12951;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("3people unFollowed me")).isEqualTo("3people Unfollowed Me");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("for the last week")).isEqualTo("For The Last Week");
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("1HELLO 1WORLD")).isEqualTo("1hello 1world");
	}
}
