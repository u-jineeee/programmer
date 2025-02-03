package me.programmer.level0.p120864;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("aAb1B2cC34oOp")).isEqualTo(37);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("1a2b3c4d123Z")).isEqualTo(133);
	}
}
