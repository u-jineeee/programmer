package me.programmer.level0.p120896;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001(){
		assertThat(new Solution().solution("abcabcadc")).isEqualTo("d");
	}

	@Test
	@DisplayName("example 2")
	void test002(){
		assertThat(new Solution().solution("abdc")).isEqualTo("abcd");
	}

	@Test
	@DisplayName("example 3")
	void test003(){
		assertThat(new Solution().solution("hello")).isEqualTo("eho");
	}
}
