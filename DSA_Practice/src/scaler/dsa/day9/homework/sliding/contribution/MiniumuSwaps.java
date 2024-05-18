package scaler.dsa.day9.homework.sliding.contribution;

public class MiniumuSwaps {
	/*
	 * Given an array of integers A and an integer B, find and return the minimum
	 * number of swaps required to bring all the numbers less than or equal to B
	 * together. Note: It is possible to swap any two elements, not necessarily
	 * consecutive.
	 */
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 12, 10, 3, 14, 10, 5 };
		int B = 8;
		int solve = solve(arr, B);
		System.out.println("\n solve=" + solve);
	}

	
    public static int solve(int[] A, int B) {
	        	int n=A.length;
    	        int countElementsLessThanB=0;
    	        int ans=Integer.MAX_VALUE;
    	        for(int i=0;i<n;i++){
    	            if(A[i]<=B){
    	                countElementsLessThanB++;
    	            }
    	        }
    	        int k=countElementsLessThanB;
    	        System.out.println("k="+countElementsLessThanB);
    	        int swapsRequired=0;
    	        for(int i=0;i<=k-1;i++){
    	        	if(A[i]>B) {
    	        		swapsRequired++;
    	        	}
    	        }
    	        //A = [1, 12, 10, 3, 14, 10, 5]  k=3
    	        ans=swapsRequired;
    	        System.out.println("swapsRequired="+swapsRequired);
    	        for(int i=1;i<=n-k;i++){
    	        	int j=i+k-1;
    	        	if(A[j]>B) {
    	        		swapsRequired++;
    	        	}
    	        	if(A[i-1]>B) {
    	        		swapsRequired--;
    	        	}
    	        	ans=Math.min(ans, swapsRequired);
    	        }

    	 return ans;
    }
}

//public int solve(int[] A, int B) {
//    int n = A.length;
//    int cnt = 0;
//    // count number of elements <= B
//    for(int x : A)  
//        if(x <= B)  
//            cnt++;
//    // If there is only one element, No need to swap
//    if(cnt <= 1)    
//        return 0;
//    else {
//        int l = 0, r = 0, x = 0;
//        // Find the count of elements <= B in every window of length cnt using two
//        //pointer approach
//        while(r < cnt) {
//            if(A[r] > B)    
//                x++;
//            r++;
//        }
//        int ans = x;
//        while(r < n) {
//            if(A[r] > B)   
//                x++;
//            if(A[l] > B)    
//                x--;
//            ans = Math.min(ans, x);
//            r++;    
//            l++;
//        }
//        return ans;
//    }
//}

//Input 1:
//
//	 A = [1, 12, 10, 3, 14, 10, 5]
//	 B = 8
//
//	Input 2:
//
//	 A = [5, 17, 100, 11]
//	 B = 20

//Example Output
//
//Output 1:
//
// 2
//
//Output 2:
//
// 1
//
//
//
//Example Explanation
//
//Explanation 1:
//
// A = [1, 12, 10, 3, 14, 10, 5]
// After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
// After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
// Now, all elements less than or equal to 8 are together.
//
//Explanation 2:
//
// A = [5, 17, 100, 11]
// After swapping 100 and 11, A => [5, 17, 11, 100].
// Now, all elements less than or equal to 20 are together.


