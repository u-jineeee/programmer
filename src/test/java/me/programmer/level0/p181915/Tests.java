package me.programmer.level0.p181915;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7})).isEqualTo("programmers");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("zpiaz", new int[]{1, 2, 0, 0, 3})).isEqualTo("pizza");
	}
}
