public class PiecewiseLinearFunctionDiv2 {

	public int[] countSolutions(int[] Y, int[] query) {
		int[] ans = new int[query.length];
		final int N = Y.length;
		for (int i = 0; i < query.length; i++) {
			ans[i] = 0;
		}
		for (int i = 0; i < query.length; i++) {
			for (int j = 0; j < N - 1; j++) {
				if (Y[j] < Y[j + 1]) {
					if (Y[j] <= query[i] && Y[j + 1] > query[i]) {
						ans[i]++;
					}
				} else if (Y[j] > Y[j + 1]) {
					if (Y[j] >= query[i] && Y[j + 1] < query[i]) {
						ans[i]++;
					}
				} else if (Y[j] == query[i]) {
					ans[i] = -1;
					break;
				}
			}
			if (Y[N - 1] == query[i] && ans[i] != -1)
				ans[i]++;
		}
		return ans;
	}
}
