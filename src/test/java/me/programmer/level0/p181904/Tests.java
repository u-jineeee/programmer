package me.programmer.level0.p181904;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("ihrhbakrfpndopljhygc", 4, 2)).isEqualTo("happy");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("programmers", 1, 1)).isEqualTo("programmers");
	}
}
