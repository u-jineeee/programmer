package me.programmer.level1.p161990;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(new String[]{".#...", "..#..", "...#."})).isEqualTo(new int[]{0, 1, 3, 4});
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."})).isEqualTo(new int[]{1, 3, 5, 8});
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."})).isEqualTo(new int[]{0, 0, 7, 9});
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution(new String[]{"..", "#."})).isEqualTo(new int[]{1, 0, 2, 1});
	}
}
