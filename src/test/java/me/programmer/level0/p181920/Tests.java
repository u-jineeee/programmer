package me.programmer.level0.p181920;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, 10)).isEqualTo(new int[]{3, 4, 5, 6, 7, 8, 9, 10});
	}
}
