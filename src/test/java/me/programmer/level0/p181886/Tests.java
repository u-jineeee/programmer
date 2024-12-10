package me.programmer.level0.p181886;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})).isEqualTo(new String[]{"nami", "vex"});
	}
}
