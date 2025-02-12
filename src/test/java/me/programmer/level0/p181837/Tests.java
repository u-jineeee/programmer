package me.programmer.level0.p181837;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"})).isEqualTo(19000);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"americanoice", "americano", "iceamericano"})).isEqualTo(13500);
	}
}
