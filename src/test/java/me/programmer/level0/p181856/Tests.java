package me.programmer.level0.p181856;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{49, 13}, new int[]{70, 11, 2})).isEqualTo(-1);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36})).isEqualTo(1);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3})).isEqualTo(0);
	}
}
