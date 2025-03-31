package me.programmer.level1.p140108;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("banana")).isEqualTo(3);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("abracadabra")).isEqualTo(6);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("aaabbaccccabba")).isEqualTo(3);
	}
}
