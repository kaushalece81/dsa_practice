package scaler.dsa.day13.homework.string;

//Problem Description
//
//Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
//
//Problem Constraints
//1 <= |A| <= 1000
//
//Input Format
//The first and only argument contains the string A, consisting of lowercase English alphabets.
//
//Output Format
//Return an integer containing the answer.

public class CountOccurences {

	public static void main(String[] args) {
		String str="abobc";
		String str1="bobob";
		int count = solve(str1);
		System.out.println(count);
		
		

	}
	
	public static int solve(String A) {
        int count=0;
        String strToFind="bob";
		char[] charArray = A.toCharArray();
		char[] charArrayToFind = strToFind.toCharArray();
		int size=charArray.length;
		for(int i=0;i<size;i++) {
			int j=0;
			if(charArrayToFind.length>0  && charArray[i]==charArrayToFind[j] ) {
				if((i+2)<=size && charArray[i+1]==charArrayToFind[j+1] &&charArray[i+2]==charArrayToFind[j+2]) {
					count++;
					i=i+1;
				}

			}
			
		}
		return count;
    }

}

//Example Input
//
//Input 1:
//
//  "abobc"
//
//Input 2:
//
//  "bobob"
//
//
//
//Example Output
//
//Output 1:
//
//  1
//
//Output 2:
//
//  2
//
//
//
//Example Explanation
//
//Explanation 1:
//
//  The only occurrence is at second position.
//
//Explanation 2:
//
//  Bob occures at first and third position.
