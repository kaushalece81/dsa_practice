package geek.mathematics;

import java.util.Scanner;

public class TrailingZerosInFactorialNumber {
// 5! =120   one trailing zero
// 10!=3628800  two trailing zeros
// 24!= 24 trailing zeros   overflow issues when number is 20 or more 
	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int factorial = factorialNumber(number);
		System.out.println("factorial of  "+ number +" is : "+ factorial);
		int countTrailingZeros = countTrailingZeros(factorial);
		System.out.println("Trailing zeros in factorial  "+ factorial +" is : "+ countTrailingZeros);
		int efficientCountTrailingZeros = efficientCountTrailingZeros(number);
		System.out.println("Efficient Trailing zeros in factorial  "+ factorial +" is : "+ efficientCountTrailingZeros);

	}

	private static int countTrailingZeros(int factorial) {
		int count =0;
		int remainder=0;
		while(factorial>0) {
			remainder=factorial%10;
			factorial=factorial/10;
			if(remainder==0) {
			count++;
			}else {
				break;
			}
		}
		return count;
	}
	// time complexity O(logn)  also solves overflow issue
	// also here we are not finding factorial
	//trailing zero count= n/5+ n/25+ n/125 ....
	private static int efficientCountTrailingZeros(int number) {
		int count=0;
		for(int i=5;i<=number;i=i*5) {
			count=count+number/i;
		}
		return count;
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
