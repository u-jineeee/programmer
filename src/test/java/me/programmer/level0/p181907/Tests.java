package me.programmer.level0.p181907;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("ProgrammerS123", 11)).isEqualTo("ProgrammerS");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("He110W0r1", 5)).isEqualTo("He110");
	}
}
