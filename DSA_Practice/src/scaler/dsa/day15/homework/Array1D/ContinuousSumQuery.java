package scaler.dsa.day15.homework.Array1D;
public class ContinuousSumQuery {
//	Problem Description
//	There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. 
	//When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.
//
//	Given the amount P donated by each devotee to the beggars ranging from L to R index, 
	//where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
//	For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B
//
//	Problem Constraints
//	1 <= A <= 2 * 105
//	1 <= L <= R <= A
//	1 <= P <= 103
//	0 <= len(B) <= 105
//
//	Input Format
//	The first argument is a single integer A.
//	The second argument is a 2D integer array B.
//
//	Output Format
//	Return an array(0 based indexing) that stores the total number of coins in each beggars pot.
	// Not able to solve
	 public int[] prefixSum(int[] A){
	        int[] pref = A;
	        for(int i = 1; i < A.length; i++){
	            pref[i] += pref[i - 1];
	        }
	        return pref;
	    }
	    public int[] solve(int A, int[][] B) {
	        int[] coins = new int[A];
	        for (int i = 0; i < A; i++) coins[i] = 0;
	        // coins is an array which denotes the number of coins that each beggar has. Initially each beggar has 0 coins.
	        for (int i = 0; i < B.length; i++) {
	            int leftIndex = B[i][0] - 1, rightIndex = B[i][1] - 1;
	            int donationByDevotee = B[i][2];
	            coins[leftIndex] += donationByDevotee;
	            if ((rightIndex + 1) < A) coins[rightIndex + 1] -= donationByDevotee;
	        }
	        int[] ans = prefixSum(coins);
	        return ans;
	    }
}

//Example Input
//Input 1:-
//
//A = 5
//B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
//
//
//
//Example Output
//Output 1:-
//
//10 55 45 25 25
//
//
//
//Example Explanation
//Explanation 1:-
//
//First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]
//Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]
//Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]