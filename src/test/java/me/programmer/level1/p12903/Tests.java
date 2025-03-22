package me.programmer.level1.p12903;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("abcde")).isEqualTo("c");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("qwer")).isEqualTo("we");
	}
}
