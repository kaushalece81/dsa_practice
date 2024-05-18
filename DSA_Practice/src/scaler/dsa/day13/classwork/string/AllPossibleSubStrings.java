package scaler.dsa.day13.classwork.string;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubStrings {

	public static void main(String[] args) {
		String str="abc";
		String [] strArray=findAllPosssibleSubString(str);
		System.out.println(strArray);
		
		List<String>  list=findAllPosssibleSubStringIUsingArrayList(str);
		System.out.println(list);

	}

	private static String[] findAllPosssibleSubString(String str) {
		int n = str.length();
		int numberOfAllPossibleSubString=n*(n+1)/2;
		String [] strArray=new String[numberOfAllPossibleSubString];
		int count=0;
		for(int i=0;i<n;i++) {
			String strChar="";
			for(int j=i;j<n;j++) {
				strChar=strChar+str.charAt(j);
				strArray[count]=strChar;
				count++;
			}
		}
		return strArray;
	}
	

	private static List<String> findAllPosssibleSubStringIUsingArrayList(String str) {
		int n = str.length();
		List<String> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				list.add(str.substring(i, j));
			}
		}
		return list;
	}

}
