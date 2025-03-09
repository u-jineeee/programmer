package me.programmer.level0.p120922;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001(){
		assertThat(new Solution().solution(2, 2)).isEqualTo(3);
	}

	@Test
	@DisplayName("example 2")
	void test002(){
		assertThat(new Solution().solution(2, 5)).isEqualTo(9);
	}

	@Test
	@DisplayName("example 3")
	void test003(){
		assertThat(new Solution().solution(1, 1)).isEqualTo(0);
	}
}
