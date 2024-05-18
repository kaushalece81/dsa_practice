package scaler.dsa.day11.assignment.sorting;

import java.util.Arrays;

public class ArithMaticProgression {
	/*
	 * Given an integer array A of size N. Return 1 if the array can be arranged to
	 * form an arithmetic progression, otherwise return 0. A sequence of numbers is
	 * called an arithmetic progression if the difference between any two
	 * consecutive elements is the same.
	 */   
	public static void main(String[] args) {
		//int arr[]=new int[] {3, 5, 1};
		int arr[]=new int[] {-87,-28,-20,37,-59,47,-75,-55,28,-9,-20,16,-56,-95,98,32,35,-97,96,74};
		
		System.out.println("solve="+solve(arr));
	}
	public static int solve(int[] A) {
        int n=A.length;
        Arrays.sort(A);

        int ans=0;
        if(n==0 || n==1){
            return ans;
        }
        int diff=A[1]-A[0];
        for(int i=0;i<n-1;i++){
           if( (A[i+1]-A[i])==diff){
               ans=1;
           }else{
               ans=0;
               return ans;
           }

        }
        return ans;
    }
}


//Example Input
//
//Input 1:
//
// A = [3, 5, 1]
//
//Input 2:
//
// A = [2, 4, 1]
//
//
//
//Example Output
//
//Output 1:
//
// 1
//
//Output 2:
//
// 0
//
//
//
//Example Explanation
//
//Explanation 1:
//
// We can reorder the elements as [1, 3, 5] or [5, 3, 1] with differences 2 and -2 respectively, between each consecutive elements.
//
//Explanation 2:
//
// There is no way to reorder the elements to obtain an arithmetic progression.