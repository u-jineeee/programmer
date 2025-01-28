package me.programmer.level0.p181905;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001(){
		assertThat(new Solution().solution("Progra21Sremm3", 6, 12)).isEqualTo("ProgrammerS123");
	}

	@Test
	@DisplayName("example 2")
	void test002(){
		assertThat(new Solution().solution("Stanley1yelnatS", 4, 10)).isEqualTo("Stanley1yelnatS");
	}
}
