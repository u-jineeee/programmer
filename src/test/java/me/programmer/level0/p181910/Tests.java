package me.programmer.level0.p181910;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("ProgrammerS123", 11)).isEqualTo("grammerS123");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("He110W0r1d", 5)).isEqualTo("W0r1d");
	}
}
