package scaler.dsa.day13.homework.string;
//You are given a string A of size N.
//Return the string A after reversing the string word by word.
//NOTE:
//    A sequence of non-space characters constitutes a word.
//    Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
//    If there are multiple spaces between words, reduce them to a single space in the reversed string.

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		String solve = solve("the sky is blue");
		System.out.println(solve);

	}
	
	public static String solve(String A) {
		String[] splitArray = A.split(" ");
		int size =splitArray.length;
		int i=0;
		int j=size-1;
		while(i<j) {
			String temp=splitArray[i];
			splitArray[i]=splitArray[j];
			splitArray[j]=temp;
			i++;
			j--;
		}
		return String.join(" ",splitArray).trim();  // trim last extra space
    }

}


//Example Input
//Input 1:
//
//A = "the sky is blue"
//
//Input 2:
//
//A = "this is ib"
//
//
//
//Example Output
//Output 1:
//
//"blue is sky the"
//
//Output 2:
//
//"ib is this"    
//
//
//
//Example Explanation
//Explanation 1:
//
//We reverse the string word by word so the string becomes "blue is sky the".
//
//Explanation 2:
//
//We reverse the string word by word so the string becomes "ib is this".


