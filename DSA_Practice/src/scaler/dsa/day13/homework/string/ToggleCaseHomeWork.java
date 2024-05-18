package scaler.dsa.day13.homework.string;
public class ToggleCaseHomeWork {
//	You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
//	You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
    public String solve(String A) {
        char[] charArray = A.toCharArray();
		int size=charArray.length;
		for(int i=0;i<size;i++) {
			if(charArray[i]>='A' && charArray[i]<='Z') {
				charArray[i]=(char)(charArray[i]+32);
			}else {
				charArray[i]=(char)(charArray[i]-32);
			}
		}
		return new String(charArray);
    }
}
//Example Input
//
//Input 1:
//
// A = "Hello" 
//
//Input 2:
//
// A = "tHiSiSaStRiNg" 
//
//
//
//Example Output
//
//Output 1:
//
// hELLO 
//
//Output 2:
//
// ThIsIsAsTrInG 
//
//
//
//Example Explanation
//
//Explanation 1:
//
// 'H' changes to 'h'
// 'e' changes to 'E'
// 'l' changes to 'L'
// 'l' changes to 'L'
// 'o' changes to 'O'
//
//Explanation 2:
//
// "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG".