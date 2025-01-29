package me.programmer.level0.p181912;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"0123456789","9876543210","9999999999999"}, 50000,5, 5)).isEqualTo(new int[]{56789, 99999});
	}
}
