package me.programmer.level0.p181870;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"and","notad","abcd"})).isEqualTo(new String[]{"and","abcd"});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"there","are","no","a","ds"})).isEqualTo(new String[]{"there","are","no","a","ds"});
	}
}
