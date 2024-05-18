package scaler.dsa.day15.homework.Array1D;
public class TapRainWater {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
//	Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
//	Problem Constraints
//
//	1 <= |A| <= 100000
//
//
//
//	Input Format
//
//	First and only argument is the vector A
//
//
//
//	Output Format
//
//	Return one integer, the answer to the question
	public static void main(String[] args) {
		//int A[] = new int[] { 0, 1, 0, 2 }; // ans 1
		int A[] = new int[] { 1,2 }; // ans 0
		int ans = trap(A);
		System.out.println("ans::" + ans);
	}
    public static int trap(final int[] A) {
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

//Example Input
//
//Input 1:
//
//A = [0, 1, 0, 2]
//
//Input 2:
//
//A = [1, 2]
//
//
//
//Example Output
//
//Output 1:
//
//1
//
//Output 2:
//
//0
//
//
//
//Example Explanation
//
//Explanation 1:
//
//1 unit is trapped on top of the 3rd element.
//
//Explanation 2:
//
//No water is trapped.

