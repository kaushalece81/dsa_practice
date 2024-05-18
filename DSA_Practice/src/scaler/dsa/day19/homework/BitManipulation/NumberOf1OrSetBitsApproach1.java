package scaler.dsa.day19.homework.BitManipulation;
public class NumberOf1OrSetBitsApproach1 {
//	Q4. Number of 1 Bits
//	Problem Description
//	Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
//
//	Problem Constraints
//	1 <= A <= 109
//
//	Input Format
//	First and only argument contains integer A
//
//	Output Format
//	Return an integer
	public static void main(String[] args) {
		//int A=11;// ans 3
		int A=6;// ans 2
		int numSetBits = numSetBits(A);  
		System.out.println(numSetBits);
	}
    public static int numSetBits(int A) {
    	int count=0;
    	for(int i=0;i<32;i++) {
    		if(checkBit(A, i)==1) {
    			count++;
    		}
    	}
    	return count;
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
//11
//
//Input 2:
//
//6

//Example Output
//Output 1:
//
//3
//
//Output 2:
//
//2
//Example Explanation
//Explaination 1:
//
//11 is represented as 1011 in binary.
//
//Explaination 2:
//
//6 is represented as 110 in binary.
