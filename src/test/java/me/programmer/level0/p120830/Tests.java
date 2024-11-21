package me.programmer.level0.p120830;

import static org.assertj.core.api.Assertions.*;

import java.lang.module.ResolutionException;

import javax.management.relation.RoleUnresolvedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("example 1")
	void test001() {
		assertThat(new Solution().solution(10, 3)).isEqualTo(124000);
	}

	@Test
	@DisplayName("example 2")
	void test002() {
		assertThat(new Solution().solution(64,6)).isEqualTo(768000);
	}
}
