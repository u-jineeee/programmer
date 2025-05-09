package me.programmer.level1.p70128;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2})).isEqualTo(3);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{-1,0,1}, new int[]{1,0,-1})).isEqualTo(-2);
	}
}
