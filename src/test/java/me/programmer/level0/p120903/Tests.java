package me.programmer.level0.p120903;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})).isEqualTo(2);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"n", "omg"}, new String[]{"m", "dot"})).isEqualTo(0);
	}
}
