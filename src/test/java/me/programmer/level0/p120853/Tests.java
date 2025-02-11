package me.programmer.level0.p120853;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("1 2 Z 3")).isEqualTo(4);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("10 20 30 40")).isEqualTo(100);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("10 Z 20 Z 1")).isEqualTo(1);
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution("10 Z 20 Z")).isEqualTo(0);
	}

	@Test
	@DisplayName("example 5")
	void test005() {
		assertThat(new Solution().solution("-1 -2 -3 Z")).isEqualTo(-3);
	}
}
