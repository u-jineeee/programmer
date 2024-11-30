package me.programmer.level0.p120893;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("cccCCC")).isEqualTo("CCCccc");
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("abCdEfghIJ")).isEqualTo("ABcDeFGHij");
	}
}