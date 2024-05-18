package geek.mathematics;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int factorial = factorialNumber(number);
		System.out.println("factorial of  "+ number +" is : "+ factorial);

	}

	private static int factorialNumber(int number) {
		int result=1;
		while(number>0) {
			result = result*number;
			number--;
		}
		return result;
	}
	
	

}
