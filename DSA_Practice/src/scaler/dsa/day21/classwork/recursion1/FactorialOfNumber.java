package scaler.dsa.day21.classwork.recursion1;

public class FactorialOfNumber {
//	Q3. Find Factorial!
//	Problem Description
//
//	Write a program to find the factorial of the given number A using recursion.
//	Note: The factorial of a number N is defined as the product of the numbers from 1 to N.
//
//	Problem Constraints
//
//	0 <= A <= 12
//
//	Input Format
//
//	First and only argument is an integer A.
//
//	Output Format
//
//	Return an integer denoting the factorial of the number A.
	public static void main(String[] args) {
		int n=5;
		int factorial=factorial(n);
		System.out.println(factorial);
	}
	private static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return factorial(n-1)*n;
	}

}

//Example Input
//
//Input 1:
//
//A = 4
//
//Input 2:
//
//A = 1
//
//
//
//Example Output
//
//Output 1:
//
//24
//
//Output 2:
//
//1
//
//
//
//Example Explanation
//
//Explanation 1:
//
//Factorial of 4 = 4 * 3 * 2 * 1 = 24
//
//Explanation 2:
//
//Factorial of 1 = 1

