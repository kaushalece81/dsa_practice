package geek.mathematics;

import java.util.Scanner;

public class PalindromeNumber {
// 525 palindrome
	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean palindrome = palindromeNumber(number);
		System.out.println("palindrome or not check whether  "+ number +" : "+ palindrome);
	}
	
	private static boolean palindromeNumber(int number) {
		boolean palindrome =false;
		int reversedNumber = findReverseOfNumber(number);
		return reversedNumber==number;
	}

	private static int findReverseOfNumber(int number) {
		//78987
		int result=0;
		int reminder=0;
		while(number>0) {
			reminder= number%10;//7,8,9
			result=result*10+reminder;//7,78,789
			number=number/10;//7898,789,78
		}
		return result;
	}

}
