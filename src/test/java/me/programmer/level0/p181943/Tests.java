package me.programmer.level0.p181943;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("He11oWor1d", "lloWorl", 2)).isEqualTo("HelloWorld");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("Program29b8UYP", "merS123", 7)).isEqualTo("ProgrammerS123");
	}
}
