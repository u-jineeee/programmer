package me.programmer.level1.p340213;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"})).isEqualTo("13:00");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("10:55", "00:05", "00:15", "06:55", new String[]{"prev", "next", "next"})).isEqualTo("06:55");
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("07:22", "04:05", "00:15", "04:07", new String[]{"next"})).isEqualTo("04:17");
	}
}
