package me.programmer.level1.p155652;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("aukks", "wbqd", 5 )).isEqualTo("happy");
	}
}
