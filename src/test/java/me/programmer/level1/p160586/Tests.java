package me.programmer.level1.p160586;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"})).isEqualTo(new int[]{9, 4});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"AA"}, new String[]{"B"})).isEqualTo(new int[]{-1});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"})).isEqualTo(new int[]{4, 6});
	}
}
