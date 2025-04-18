package me.programmer.level2.p12981;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})).isEqualTo(new int[]{3,3});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})).isEqualTo(new int[]{0,0});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})).isEqualTo(new int[]{1,3});
	}
}
