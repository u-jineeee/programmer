package me.programmer.level0.p181875;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"AAA","BBB","CCC","DDD"})).isEqualTo(new String[]{"aaa","BBB","ccc","DDD"});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"aBc","AbC"})).isEqualTo(new String[]{"abc","ABC"});
	}
}
