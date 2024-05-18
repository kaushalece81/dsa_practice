package scaler.dsa.day13.homework.string;

public class ReverseString {

	public static void main(String[] args) {
		String solve = solve("scaler");
		System.out.println(solve);

	}
	
	public static String solve(String A) {
		char[] charArray = A.toCharArray();
		int size =charArray.length;
		int i=0;
		int j=size-1;
		while(i<j) {
			char temp=charArray[i];
			charArray[i]=charArray[j];
			charArray[j]=temp;
			i++;
			j--;
		}
		return new String(charArray);
    }

}
