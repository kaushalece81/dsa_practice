package scaler.dsa.day19.homework.BitManipulation;
public class UnsetThe_ithBit {
//	Q2. Unset i-th bit
//	Problem Description
//	You are given two integers A and B.
//
//	    If B-th bit in A is set, make it unset.
//	    If B-th bit in A is unset, leave as it is.
//
//	Return the updated A value.
//
//	Note:
//	The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
//
//	Problem Constraints
//	1 <= A <= 109
//	0 <= B <= 30
//
//	Input Format
//	First argument A is an integer.
//	Second argument B is an integer.
//
//	Output Format
//	Return an integer.
	public static void main(String[] args) {
		int A=4;
		int B=1;
		int unsetThe_ithBit = unsetThe_ithBit(A,B);
		System.out.println(unsetThe_ithBit);
	}
    public static int unsetThe_ithBit(int n, int i) {
    	if(checkBit(n, i)==1) {
    		n=n^(1<<i);
    	}
    	return n;
    }
    private static  int checkBit(int n, int i) {
    	if(((n>>i)&1)==0) {
    		return 0;
    	}
    	return 1;
    }
}

//Example Input
//Input 1:
//
//A = 4
//B = 1
//
//Input 2:
//
//A = 5
//B = 2
//
//
//
//Example Output
//Output 1:
//
//4
//
//Output 2:
//
//1
//
//
//
//Example Explanation
//For Input 1:
//
//Given N = 4 which is 100 in binary. The 1-st bit is already unset
//
//For Input 2:
//
//Given N = 5 which is 101 in binary. We unset the 2-nd bit
//It becomes 001 which is 1 in Decimal.