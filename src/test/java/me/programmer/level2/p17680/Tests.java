package me.programmer.level2.p17680;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"})).isEqualTo(50);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"})).isEqualTo(21);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})).isEqualTo(60);
	}

	@Test
	@DisplayName("example 4")
	void test004() {
		assertThat(new Solution().solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})).isEqualTo(52);
	}

	@Test
	@DisplayName("example 5")
	void test005() {
		assertThat(new Solution().solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"})).isEqualTo(16);
	}

	@Test
	@DisplayName("example 6")
	void test006() {
		assertThat(new Solution().solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"})).isEqualTo(25);
	}
}
