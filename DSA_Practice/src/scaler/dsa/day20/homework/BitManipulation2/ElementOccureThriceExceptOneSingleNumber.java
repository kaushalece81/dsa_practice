package scaler.dsa.day20.homework.BitManipulation2;
public class ElementOccureThriceExceptOneSingleNumber {
   //Q2. Single Number II



	public static void main(String[] args) {
		int [] A=new int[] {4,5,5,4,11,6,6,4,5,6};//11
		
		int singleNumber = singleNumber(A);
		System.out.println(singleNumber);
	}
	// not able to self find
	public static int singleNumber(final int[] A) {
		 int[] bits = new int[32];
	        // check frequency of each bit
	        for (int num: A) {
	            for (int i = 0; i < 32; i++) {
	                bits[i] += (1 & (num >> i));
	                bits[i] %= 3;
	            }
	        }
	        int number = 0;
	        for (int i = 31; i >= 0; i--) {
	            number = number * 2 + bits[i];
	        }
	        return number;
    }
//    public static int singleNumber(final List<Integer> A) {
//    	int
//    }
}


//Example Input
//
//Input 1:
//
// A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
//
//Input 2:
//
// A = [0, 0, 0, 1]
//
//
//
//Example Output
//
//Output 1:
//
// 4
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
// 4 occurs exactly once in Input 1.
// 1 occurs exactly once in Input 2.
//
