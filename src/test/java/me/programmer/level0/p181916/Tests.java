package me.programmer.level0.p181916;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(2,2,2,2)).isEqualTo(2222);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(4,1,4,4)).isEqualTo(1681);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(6,3,3,6)).isEqualTo(27);
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution(2,5,2,6)).isEqualTo(30);
	}


	@Test
	@DisplayName("example 5")
	void test005() {
		assertThat(new Solution().solution(6,4,2,5)).isEqualTo(2);
	}
}
