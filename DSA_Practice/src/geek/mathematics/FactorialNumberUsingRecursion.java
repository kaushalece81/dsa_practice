package geek.mathematics;

import java.util.Scanner;

public class FactorialNumberUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int factorial = factorialNumber(number);
		System.out.println("factorial of  "+ number +" is : "+ factorial);

	}

	private static int factorialNumber(int number) {
		//base case
		if(number==0) {
			return 1;
		}
		return number*factorialNumber(number-1);
	}
	
	

}
