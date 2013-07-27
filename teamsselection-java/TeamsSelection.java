public class TeamsSelection {

	public String simulate(int[] preference1, int[] preference2) {
		final int N = preference1.length;
		int now1 = 0, now2 = 0;
		boolean flag1 = false, flag2 = false;
		int count = 0;
		int[] cap = new int[N];
		String ans = "";
		for (int i = 0; i < N; i++) {
			cap[i] = 0;
		}
		while (count < N) {
			flag1 = false;
			flag2 = false;
			while (!flag1) {
				if (cap[preference1[now1]-1] == 0) {
					cap[preference1[now1]-1] = 1;
					now1++;
					count++;
					flag1 = true;
				} else {
					now1++;
				}
			}
			if (count >= N)
				break;
			while (!flag2) {
				if (cap[preference2[now2]-1] == 0) {
					cap[preference2[now2]-1] = 2;
					now2++;
					count++;
					flag2 = true;
				} else {
					now2++;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			ans += Integer.toString(cap[i]);
		}
		System.out.println(ans);

		return ans;
	}
}
