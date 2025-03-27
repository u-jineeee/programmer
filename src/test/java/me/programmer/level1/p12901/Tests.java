package me.programmer.level1.p12901;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(5, 24)).isEqualTo("TUE");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(1, 1)).isEqualTo("FRI");
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(2, 1)).isEqualTo("MON");
	}
}
