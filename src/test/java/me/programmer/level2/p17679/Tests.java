package me.programmer.level2.p17679;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"})).isEqualTo(14);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"})).isEqualTo(15);
	}
}
