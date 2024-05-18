package geek.mathematics;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers :");
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int gcd= gcdOfNumber(number1,number2);
		System.out.println("gcd of numbers : "+number1+ " & " + number2+"is : "+gcd);
		
		int gcdEuclidean= gcdOfNumberUsingEuclideanAlgorithm(number1,number2);
		System.out.println("gcdEuclidean  of numbers : "+number1+ " & " + number2+"is : "+gcdEuclidean);
		int gcdEuclideanOptimized= gcdOfNumberUsingEuclideanAlgorithmOptimized(number1,number2);
		System.out.println("gcdEuclideanOptimized  of numbers : "+number1+ " & " + number2+"is : "+gcdEuclideanOptimized);

	}
	
	//optimized solution
		private static int gcdOfNumberUsingEuclideanAlgorithmOptimized(int number1, int number2) {
			int gcd=0;
				if(number2==0) {
					gcd=number1;
					return gcd;
				}else {
					gcd=gcdOfNumberUsingEuclideanAlgorithmOptimized(number2,(number1%number2));
				}
			return gcd;
		}
	//gcd(a,b)=gcd(a-b,b) if b is smaller than
	private static int gcdOfNumberUsingEuclideanAlgorithm(int number1, int number2) {
		while(number1!=number2) {
			if(number1>number2) {
				number1=number1-number2;
			}else {
				number2=number2-number1;
			}
		}
		return number1;
	}
	

	private static int gcdOfNumber(int number1, int number2) {
		int gcd=0;
		// min(num1,num1)
		int minNum=findMinOfNumbers(number1,number2);
		int i=1;
		while(i<=minNum) {
			if(number1%i==0 && number2%i==0) {
				gcd=i;
			}
			i=i+1;
		}
		return gcd;
	}

	private static int findMinOfNumbers(int number1, int number2) {
		int minNum=0;
		if(number1>number2) {
			minNum=number2;
			return minNum;
		}else {
			minNum=number1;
		}
		return minNum;
	}

}
