package me.programmer.level2.p77885;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new long[] {2,7})).isEqualTo(new long[]{3, 11});
	}
}
