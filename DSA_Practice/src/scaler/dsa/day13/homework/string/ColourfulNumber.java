package scaler.dsa.day13.homework.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ColourfulNumber {
//	Given a number A, find if it is COLORFUL number or not.
//
//	If number A is a COLORFUL number return 1 else, return 0.
//
//	What is a COLORFUL Number:
//
//	A number can be broken into different consecutive sequence of digits. 
//	The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324, 245 and 3245. 
//	This number is a COLORFUL number, since the product of every consecutive sequence of digits is different
//	Problem Constraints
//
//	1 <= A <= 2 * 109
//
//
//
//	Input Format
//
//	The first and only argument is an integer A.
//
//
//
//	Output Format
//
//	Return 1 if integer A is COLORFUL else return 0.



	public static void main(String[] args) {
//		int A=23;
//		int A=236;
//		int A=123;
		int A=263;
		int colorful = colorful(A);
		System.out.println(colorful);

	}
	
	public static int colorful(int A) {
		String str = String.valueOf(A);
		//int sizeOfSubArraysPosssible=(size*(size+1))/2;
		int numbers[]=new int[str.length()];
		Set<Integer> set=new HashSet<>();
		int ans=0;
		int count=0;
		while(A>0) {
			int rem=A%10;
			numbers[count]=rem;
			count++;
			A=A/10;
		}
		//Note array formed will be reverse in number for example 23--> 3,2
		//hence reverse the array then
		reverse(numbers);
		System.out.println(Arrays.toString(numbers));
		int size=numbers.length;
		for(int i=0;i<size;i++) {
			int prod=1;
			for(int j=i;j<size;j++) {
				prod=prod*numbers[j];
				if(!set.contains(prod)) {
					set.add(prod);
					ans=1;
				}else {
					ans=0;
					return ans;
				}
			}
		}
		
		return ans;
    }
	
	private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move to the next pair of elements
            start++;
            end--;
        }
    }

}


//Example Input
//
//Input 1:
//
// A = 23
//
//Input 2:
//
// A = 236
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
// Possible Sub-sequences: [2, 3, 23] where
// 2 -> 2 
// 3 -> 3
// 23 -> 6  (product of digits)
// This number is a COLORFUL number since product of every digit of a sub-sequence are different. 
//
//Explanation 2:
//
// Possible Sub-sequences: [2, 3, 6, 23, 36, 236] where
// 2 -> 2 
// 3 -> 3
// 6 -> 6
// 23 -> 6  (product of digits)
// 36 -> 18  (product of digits)
// 236 -> 36  (product of digits)
// This number is not a COLORFUL number since the product sequence 23  and sequence 6 is same. 



