package me.programmer.level0.p181909;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("banana")).isEqualTo(new String[]{"a", "ana", "anana", "banana", "na", "nana"});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("programmers")).isEqualTo(new String[]{"ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"});
	}
}
