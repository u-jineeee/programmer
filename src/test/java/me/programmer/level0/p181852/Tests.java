package me.programmer.level0.p181852;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001(){
		assertThat(new Solution().solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})).isEqualTo(new int[]{15, 32, 38, 46, 56});
	}
}
