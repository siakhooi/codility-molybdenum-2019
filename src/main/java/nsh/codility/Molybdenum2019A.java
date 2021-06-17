package nsh.codility;

import java.util.Arrays;

public class Molybdenum2019A implements Molybdenum2019Interface {

	int[] COUNT;
	boolean[] SELECTED;
	int[] R = new int[5];
	int r = 0;
	int Leader;

	void add(int a) {
		if (COUNT[a] > Leader)
			if (!SELECTED[a]) {
				R[r++] = a;
				SELECTED[a] = true;
			}
	}

	public int[] solution(int K, int M, int[] A) {
		int N = A.length;
		Leader = N / 2;
		SELECTED = new boolean[M + 2];
		COUNT = new int[M + 2];

		for (int i = 0; i < K; i++) {
			COUNT[++A[i]]++;
			add(A[i]);
		}
		for (int i = K; i < N; i++) {
			COUNT[A[i]]++;
			add(A[i]);
		}

		int x1 = 0, x2 = K;
		while (x2 < N) {
			COUNT[A[x1]--]--;
			COUNT[A[x1]]++;

			COUNT[A[x2]++]--;
			COUNT[A[x2]]++;

			add(A[x1]);
			add(A[x2]);

			x1++;
			x2++;
		}

		Arrays.sort(R, 0, r);
		return Arrays.copyOf(R, r);
	}
}
