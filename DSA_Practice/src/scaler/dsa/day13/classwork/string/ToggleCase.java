package scaler.dsa.day13.classwork.string;

import java.util.Arrays;

public class ToggleCase {

	public static void main(String[] args) {
		String str=toggleCase("HeLlo");
		System.out.println(str);
	}
	
	private static String toggleCase(String str) {
		char[] charArray = str.toCharArray();
		int size=charArray.length;
		for(int i=0;i<size;i++) {
			if(charArray[i]>='A' && charArray[i]<='Z') {
				charArray[i]=(char)(charArray[i]+32);
			}else {
				charArray[i]=(char)(charArray[i]-32);
			}
		}
		return Arrays.toString(charArray);
	}

}
