package me.programmer.level0.p120956;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"})).isEqualTo(1);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"})).isEqualTo(3);
	}
}
