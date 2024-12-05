package me.programmer.level0.p181868;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(" i    love  you")).isEqualTo(new String[]{"i", "love", "you"});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("    programmers  ")).isEqualTo(new String[]{"programmers"});
	}
}
