package me.programmer.level0.p181854;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{49, 12, 100, 276, 33}, 27)).isEqualTo(new int[]{76, 12, 127, 276, 60});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{444, 555, 666, 777}, 100)).isEqualTo(new int[]{444, 655, 666, 877});
	}
}
