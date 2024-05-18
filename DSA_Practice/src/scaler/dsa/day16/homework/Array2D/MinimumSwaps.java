package scaler.dsa.day16.homework.Array2D;
public class MinimumSwaps {
	//Q1. Minimum Swaps
      public int solve(int[] A, int B) {
        int n = A.length;
        int cnt = 0;
        // count number of elements <= B
        for(int x : A)  
            if(x <= B)  
                cnt++;
        // If there is only one element, No need to swap
        if(cnt <= 1)    
            return 0;
        else {
            int l = 0, r = 0, x = 0;
            // Find the count of elements <= B in every window of length cnt using two
            //pointer approach
            while(r < cnt) {
                if(A[r] > B)    
                    x++;
                r++;
            }
            int ans = x;
            while(r < n) {
                if(A[r] > B)   
                    x++;
                if(A[l] > B)    
                    x--;
                ans = Math.min(ans, x);
                r++;    
                l++;
            }
            return ans;
        }
    }
}
