package me.programmer.level1.p131128;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("100", "2345")).isEqualTo("-1");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("100", "203045")).isEqualTo("0");
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("100", "123450")).isEqualTo("10");
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution("12321", "42531")).isEqualTo("321");
	}

	@Test
	@DisplayName("example 5")
	void test005() {
		assertThat(new Solution().solution("5525", "1255")).isEqualTo("552");
	}
}
