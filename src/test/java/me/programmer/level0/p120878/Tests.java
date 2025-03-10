package me.programmer.level0.p120878;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001(){
		assertThat(new Solution().solution(7, 20)).isEqualTo(1);
	}

	@Test
	@DisplayName("example 2")
	void test002(){
		assertThat(new Solution().solution(11, 22)).isEqualTo(1);
	}

	@Test
	@DisplayName("example 3")
	void test003(){
		assertThat(new Solution().solution(12, 21)).isEqualTo(2);
	}
}
