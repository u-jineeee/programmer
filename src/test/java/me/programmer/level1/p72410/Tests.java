package me.programmer.level1.p72410;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("exmaple 1")
	void test001() {
		assertThat(new Solution().solution("...!@BaT#*..y.abcdefghijklm")).isEqualTo("bat.y.abcdefghi");
	}

	@Test
	@DisplayName("exmaple 2")
	void test002() {
		assertThat(new Solution().solution("z-+.^.")).isEqualTo("z--");
	}

	@Test
	@DisplayName("exmaple 3")
	void test003() {
		assertThat(new Solution().solution("=.=")).isEqualTo("aaa");
	}

	@Test
	@DisplayName("exmaple 4")
	void test004() {
		assertThat(new Solution().solution("123_.def")).isEqualTo("123_.def");
	}

	@Test
	@DisplayName("exmaple 5")
	void test005() {
		assertThat(new Solution().solution("abcdefghijklmn.p")).isEqualTo("abcdefghijklmn");
	}
}
