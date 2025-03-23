package me.programmer.level1.p12922;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3)).isEqualTo("수박수");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(4)).isEqualTo("수박수박");
	}
}
