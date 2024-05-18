package scaler.dsa.day15.classwork.Array1D;

public class TappingRainWater {

	public static void main(String[] args) {
		int A[] = new int[] { 2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1 }; // ans 8
		int ans = TappingRainWater(A);
		System.out.println("ans::" + ans);
	}

	private static int TappingRainWater(int[] A) {
		int waterTrapped = 0;
		int n = A.length;
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];

		// Calculate maximum height bars to the left of each bar
		leftMax[0] = A[0];
		for (int i = 1; i < n; i++) {
			leftMax[i] = Math.max(A[i], leftMax[i - 1]);
		}

		// Calculate maximum height bars to the right of each bar
		rightMax[n - 1] = A[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = Math.max(A[i], rightMax[i + 1]);
		}
		
		// Calculate water trapped at each bar
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            waterTrapped += minHeight - A[i];
        }
		return waterTrapped;
	}

}
