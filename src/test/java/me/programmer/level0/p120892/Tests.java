package me.programmer.level0.p120892;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("dfjardstddetckdaccccdegk", 4)).isEqualTo("attack");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("pfqallllabwaoclk", 2)).isEqualTo("fallback");
	}
}
