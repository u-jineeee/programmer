package me.programmer.level2.p12913;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}})).isEqualTo(16);
	}
}
