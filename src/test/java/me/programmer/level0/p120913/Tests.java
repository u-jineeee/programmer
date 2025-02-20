package me.programmer.level0.p120913;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("abc1Addfggg4556b", 6)).isEqualTo(new String[]{"abc1Ad", "dfggg4", "556b"});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("abcdef123", 3)).isEqualTo(new String[]{"abc", "def", "123"});
	}
}
