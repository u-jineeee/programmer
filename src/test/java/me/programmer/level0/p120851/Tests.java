package me.programmer.level0.p120851;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("aAb1B2cC34oOp")).isEqualTo(10);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("1a2b3c4d123")).isEqualTo(16);
	}
}
