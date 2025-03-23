package me.programmer.level1.p12948;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("01033334444")).isEqualTo("*******4444");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("027778888")).isEqualTo("*****8888");
	}
}
