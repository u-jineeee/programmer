package me.programmer.level0.p181925;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1})).isEqualTo("wsdawsdassw");
	}
}
