package me.programmer.level2.p42842;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(10, 2)).isEqualTo(new int[]{4, 3});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(8, 1)).isEqualTo(new int[]{3, 3});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(24, 24)).isEqualTo(new int[]{8, 6});
	}
}
