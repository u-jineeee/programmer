package me.programmer.level2.p12980;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(5)).isEqualTo(2);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(6)).isEqualTo(2);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(5000)).isEqualTo(5);
	}
}
