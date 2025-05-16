package me.programmer.level2.p49993;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"})).isEqualTo(2);
	}
}
