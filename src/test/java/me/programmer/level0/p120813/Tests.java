package me.programmer.level0.p120813;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001(){
		assertThat(new Solution().solution(10)).isEqualTo(new int[]{1, 3, 5, 7, 9});
	}

	@Test
	@DisplayName("example 2")
	void test002(){
		assertThat(new Solution().solution(15)).isEqualTo(new int[]{1, 3, 5, 7, 9, 11, 13, 15});
	}
}
