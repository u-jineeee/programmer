package me.programmer.level0.p181866;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("Example 1")
	void test001() {
		assertThat(new Solution().solution("axbxcxdx")).isEqualTo(new String[] {"a","b","c","d"});
	}

	@Test
	@DisplayName("Example 2")
	void test002() {
		assertThat(new Solution().solution("dxccxbbbxaaaa")).isEqualTo(new String[] {"aaaa","bbb","cc","d"});
	}

	@Test
	@DisplayName("Example 3")
	void test003() {
		assertThat(new Solution().solution("aaxxab")).isEqualTo(new String[] {"aa","ab"});
	}
}
