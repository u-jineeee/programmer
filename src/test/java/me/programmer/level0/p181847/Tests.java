package me.programmer.level0.p181847;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001(){
		assertThat(new Solution().solution("0010")).isEqualTo("10");
	}

	@Test
	@DisplayName("example 2")
	void test002(){
		assertThat(new Solution().solution("854020")).isEqualTo("854020");
	}
}