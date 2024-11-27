package me.programmer.level0.p120849;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("bus")).isEqualTo("bs");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("nice to meet you")).isEqualTo("nc t mt y");
	}
}
