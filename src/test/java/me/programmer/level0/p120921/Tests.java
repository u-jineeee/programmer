package me.programmer.level0.p120921;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001(){
		assertThat(new Solution().solution("hello", "ohell")).isEqualTo(1);
	}

	@Test
	@DisplayName("example 2")
	void test002(){
		assertThat(new Solution().solution("apple", "elppa")).isEqualTo(-1);
	}

	@Test
	@DisplayName("example 3")
	void test003(){
		assertThat(new Solution().solution("abc", "abc")).isEqualTo(0);
	}
}
