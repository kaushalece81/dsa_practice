package geek.mathematics;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers :");
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int lcm= lcmOfNumber(number1,number2);
		System.out.println("lcm of numbers : "+number1+ " & " + number2+" is : "+lcm);
		
		int lcmOptimized= lcmOfNumberOptimized(number1,number2);
		System.out.println("lcmOptimized of numbers : "+number1+ " & " + number2+" is : "+lcmOptimized);

	}
	// a8b =gcd(a,b) * lcm(a,b)
	private static int lcmOfNumberOptimized(int number1, int number2) {
		int lcm=0;
		int gcd=gcdOfNumberUsingEuclideanAlgorithmOptimized( number1,  number2);
		lcm=(number1*number2)/gcd;
		return lcm;
	}
	
	
	//optimized solution gcd
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
//naive solution
	private static int lcmOfNumber(int number1, int number2) {
		int lcm=0;
		//int maxNum=findMaxOfNumbers(number1,number2);
		int maxNum=Math.max(number1, number2);
		lcm=maxNum;
		while(true) {
			if(lcm%number1==0 && lcm % number2==0) {
				return lcm;
			}
			lcm++;
		}
	}
	
	private static int findMaxOfNumbers(int number1, int number2) {
		int maxNum=0;
		if(number1>number2) {
			maxNum=number2;
			return maxNum;
		}else {
			maxNum=number1;
		}
		return maxNum;
	}

}
