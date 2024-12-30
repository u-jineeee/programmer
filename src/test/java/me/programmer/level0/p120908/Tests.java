package me.programmer.level0.p120908;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution("ab6CDE443fgh22iJKlmn1o", "6CD")).isEqualTo(1);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution("ppprrrogrammers", "pppp")).isEqualTo(2);
	}

	@Test
	@DisplayName("example 3")
	void test003() {
		assertThat(new Solution().solution("AbcAbcA", "AAA")).isEqualTo(2);
	}
}
