package me.programmer.level0.p120815;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void tesst001() {
		assertThat(new Solution().solution(6)).isEqualTo(1);
	}

	@Test
	@DisplayName("example 2")
	void tesst002() {
		assertThat(new Solution().solution(10)).isEqualTo(5);
	}

	@Test
	@DisplayName("example 3")
	void tesst003() {
		assertThat(new Solution().solution(4)).isEqualTo(2);
	}
}
