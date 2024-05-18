package scaler.day7.homework.prefixsum;

public class EquilibriumIndexProblem {

	public static void main(String[] args) {
		int[] A = new int[] { -7, 1, 5, 2, -4, 3, 0 };
		int solve = solve(A);
		System.out.println(solve);

	}

	public static int solve(int[] A) {
		int equilibriumIndex = -1;
		int n = A.length;
		long[] prefix = new long[n];
		prefix[0] = A[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + A[i];
		}
		// [-7, -6, -1, 1, -3, 0, 0]

		for (int i = 0; i < n; i++) {
			long leftSum = 0;
			long rightSum = 0;
			int lLeft = i;
			int rLeft = i - 1;
			int lRight = i + 1;
			int rRight = n - 1;
			// leftsum 0 to i-1
			// rightsum i+1 to n-1
			if (lLeft == 0) {
				leftSum = 0;
			} else {
				leftSum = prefix[rLeft];
			}
			rightSum = prefix[rRight] - prefix[lRight - 1];

			if (leftSum == rightSum) {
				equilibriumIndex = i;
				return equilibriumIndex;
			}
		}
		return equilibriumIndex;
	}

}
