package me.programmer.level0.p181844;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12})).isEqualTo(new int[]{293, 395, 678});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43})).isEqualTo(new int[]{110, 66, 439, 785, 1});
	}
}
