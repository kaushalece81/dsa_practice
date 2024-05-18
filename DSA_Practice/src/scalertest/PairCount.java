.package scalertest;

public class PairCount {

	public static void main(String[] args) {
		//int A[]= {1,1,1};
		int A[] = { 2, 4, 9, 1, 9, 7, 6, 4, 9 };
		//int B=2;
		int B = 8;
		int count = solve(A, B);
		System.out.println(count);

	}

	private static int solve(int[] A, int B) {
		// Just write your code below to complete the function. Required input is
		// available to you as the function arguments.
		// Do not print the result or any output. Just return the result via this
		// function.
		int count = 0;
		int length = A.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if ((A[i] + A[j]) == B) {
					System.out.println("A[i]: "+A[i]+" A[j]: "+A[j]  +"  matched");
					count++;
				}else {
					System.out.println("A[i]: "+A[i]+" A[j]: "+A[j]  +"  not matched");
				}
			}
		}
		return count;
	}

}
