package geek.mathematics;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int countDigits = countDigits(number);
		System.out.println("countDigits in the number : "+number +" is : "+countDigits);
	}

	private static int countDigits(int number) {
		int count =0;
		while(number > 0) {
			number=number/10;
			count++;
		}
		return count;
	}

}
