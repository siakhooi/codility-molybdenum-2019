package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public abstract class AbstractMolybdenum2019Test {
	abstract Molybdenum2019Interface getTestObject();

	@Test
	void test01() {
		int K = 3;
		int M = 5;
		int[] A = new int[] { 2, 1, 3, 1, 2, 2, 3 };
		int[] E = new int[] { 2, 3 };

		assertArrayEquals(E, getTestObject().solution(K, M, A));
	}

	@Test
	void test02() {
		int K = 4;
		int M = 2;
		int[] A = new int[] { 1, 2, 2, 1, 2 };
		int[] E = new int[] { 2, 3 };

		assertArrayEquals(E, getTestObject().solution(K, M, A));
	}

	@Test
	void test03() {
		int K = 3;
		int M = 5;
		int[] A = new int[] { 1, 1, 1, 1, 1, 1 };
		int[] E = new int[] {};

		assertArrayEquals(E, getTestObject().solution(K, M, A));
	}

}
