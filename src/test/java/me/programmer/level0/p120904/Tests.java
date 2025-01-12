package me.programmer.level0.p120904;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(29183, 1)).isEqualTo(3);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(232443, 4)).isEqualTo(4);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(123456, 7)).isEqualTo(-1);
	}
}
