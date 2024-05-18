package com.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str="DALDA";
		String str1= "ADAlD";
		
		boolean bool=checkAnagram1(str,str1);
		System.out.println(bool);
		
		boolean bool1=checkAnagram2(str,str1);
		System.out.println(bool1);
	}

	private static boolean checkAnagram1(String str, String str1) {
		char[] charArray = str.toLowerCase().toCharArray();
		char[] charArray1 = str1.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		return Arrays.equals(charArray, charArray1);
	}
	
	private static boolean checkAnagram2(String str, String str1) {
		char[] charArray = str.toLowerCase().toCharArray();
		char[] charArray1 = str1.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		String sortedString = new String(charArray);
		String sortedString1 = new String(charArray1);
		return sortedString.equals(sortedString1);
	}
	
	

}
