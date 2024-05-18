package scaler.dsa.day19.homework.BitManipulation;

public class SetThe_ithBit {
//	Q1. Set Bit
//	Problem Description
//	You are given two integers A and B.
//	Set the A-th bit and B-th bit in 0, and return output in decimal Number System.
//
//	Note:
//	The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.
//
//	Problem Constraints
//	0 <= A <= 30
//	0 <= B <= 30
//
//	Input Format
//	First argument A is an integer.
//	Second argument B is an integer.
//
//	Output Format
//	Return an integer.
	public static void main(String[] args) {
//		int A = 3;// ans 40
//		int B = 5;// ans 40
		
		int A = 4;// ans 16
		int B = 4;// ans 16
		int num = setTheIthBit(A, B);
		System.out.println(num);

	}

	private static int setTheIthBit(int A, int B) {
		int n=0;
		//set Ath bit in n
		 n=(n|(1<<A));
		 //set Bth bit in n
		 n=(n|(1<<B));
		return n;
	}

}

//Example Input
//Input 1:
//
//A = 3
//B = 5
//
//Input 2:
//
//A = 4
//B = 4
//
//
//
//Example Output
//Output 1:
//
//40
//
//Output 2:
//
//16
//
//
//
//Example Explanation
//For Input 1:
//
//The binary expression is 101000 which is 40 in decimal.
//
//For Input 2:
//
//The binary expression is 10000 which is 16 in decimal

