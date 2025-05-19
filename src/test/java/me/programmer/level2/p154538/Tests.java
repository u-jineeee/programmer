package me.programmer.level2.p154538;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(10, 40, 5)).isEqualTo(2);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(10, 40, 30)).isEqualTo(1);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(2, 5, 4)).isEqualTo(-1);
	}
}
