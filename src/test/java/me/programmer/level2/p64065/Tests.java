package me.programmer.level2.p64065;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")).isEqualTo(new int[]{2, 1, 3, 4});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"	)).isEqualTo(new int[]{2, 1, 3, 4});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("{{20,111},{111}}")).isEqualTo(new int[]{111, 20});
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution("{{123}}")).isEqualTo(new int[]{123});
	}

	@Test
	@DisplayName("example 5")
	void test005() {
		assertThat(new Solution().solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"	)).isEqualTo(new int[]{3, 2, 4, 1});
	}
}
