package me.programmer.level2.p17687;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(2, 4, 2, 1)).isEqualTo("0111");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(16, 16, 2, 1)).isEqualTo("02468ACE11111111");
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(16, 16, 2, 2)).isEqualTo("13579BDF01234567");
	}
}
