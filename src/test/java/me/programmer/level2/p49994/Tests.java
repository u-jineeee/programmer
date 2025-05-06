package me.programmer.level2.p49994;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("ULURRDLLU")).isEqualTo(7);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("LULLLLLLU")).isEqualTo(7);
	}
}
