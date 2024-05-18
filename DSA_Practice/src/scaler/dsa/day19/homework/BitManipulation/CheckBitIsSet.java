package scaler.dsa.day19.homework.BitManipulation;
public class CheckBitIsSet {
//	Q3. Check bit
//	Problem Description
//	You are given two integers A and B.
//
//	    Return 1 if B-th bit in A is set
//	    Return 0 if B-th bit in A is unset
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
//		int solve = checkBit(4, 1);  //0
		int solve = checkBit(5, 2);  // 1
		System.out.println(solve);
		
	}
    public static  int checkBit(int n, int i) {
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
//0
//
//Output 2:
//
//1


