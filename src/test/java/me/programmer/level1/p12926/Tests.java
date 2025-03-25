package me.programmer.level1.p12926;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("AB", 1)).isEqualTo("BC");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("z", 1)).isEqualTo("a");
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("a B z", 4)).isEqualTo("e F d");
	}
}
