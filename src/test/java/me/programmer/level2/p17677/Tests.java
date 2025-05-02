package me.programmer.level2.p17677;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("FRANCE", "french")).isEqualTo(16384);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("handshake", "shake hands")).isEqualTo(65536);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("aa1+aa2", "AAAA12")).isEqualTo(43690);
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution("E=M*C^2\t", "e=m*c^2")).isEqualTo(65536);
	}
}
