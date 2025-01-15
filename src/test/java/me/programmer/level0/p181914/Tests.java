package me.programmer.level0.p181914;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("123")).isEqualTo(6);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("78720646226947352489")).isEqualTo(2);
	}
}
