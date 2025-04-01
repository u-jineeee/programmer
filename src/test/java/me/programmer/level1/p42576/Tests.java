package me.programmer.level1.p42576;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"})).isEqualTo("leo");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"})).isEqualTo("vinko");
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"})).isEqualTo("mislav");
	}
}
