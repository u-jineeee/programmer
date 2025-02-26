package me.programmer.level0.p181846;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001(){
		assertThat(new Solution().solution("582", "734")).isEqualTo("1316");
	}

	@Test
	@DisplayName("example 2")
	void test002(){
		assertThat(new Solution().solution("18446744073709551615", "287346502836570928366")).isEqualTo("305793246910280479981");
	}

	@Test
	@DisplayName("example 3")
	void test003(){
		assertThat(new Solution().solution("0", "0")).isEqualTo("0");
	}
}
