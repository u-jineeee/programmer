package me.programmer.level1.p12930;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("try hello world")).isEqualTo("TrY HeLlO WoRlD");
	}
}
