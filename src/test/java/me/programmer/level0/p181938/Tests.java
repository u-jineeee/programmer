package me.programmer.level0.p181938;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(2, 91)).isEqualTo(364);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(91, 2)).isEqualTo(912);
	}
}
