package me.programmer.level1.p17682;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("1S2D*3T")).isEqualTo(37);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("1D2S#10S")).isEqualTo(9);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("1D2S0T")).isEqualTo(3);
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution("1S*2T*3S")).isEqualTo(23);
	}

	@Test
	@DisplayName("example 5")
	void test005() {
		assertThat(new Solution().solution("1D#2S*3S")).isEqualTo(5);
	}

	@Test
	@DisplayName("example 6")
	void test006() {
		assertThat(new Solution().solution("1T2D3D#")).isEqualTo(-4);
	}

	@Test
	@DisplayName("example 7")
	void test007() {
		assertThat(new Solution().solution("1D2S3T*")).isEqualTo(59);
	}
}
