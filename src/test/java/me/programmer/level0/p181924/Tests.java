package me.programmer.level0.p181924;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3},{1, 2},{1, 4}})).isEqualTo(new int