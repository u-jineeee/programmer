package me.programmer.level0.p120818;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(150000)).isEqualTo(142500);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(580000)).isEqualTo(464000);
	}
}
