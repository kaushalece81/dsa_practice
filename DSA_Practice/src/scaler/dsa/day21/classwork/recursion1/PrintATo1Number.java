package scaler.dsa.day21.classwork.recursion1;

public class PrintATo1Number {
//	Q2. Print A to 1 function
//	Problem Description
//
//	You are given an integer A, print A to 1 using using recursion.
//
//	Note :- After printing all the numbers from A to 1, print a new line.
//
//	Problem Constraints
//
//	1 <= A <= 104
//
//	Input Format
//
//	First argument A is an integer.
//
//	Output Format
//
//	Print A space-separated integers A to 1.
//	Note: There should be exactly one space after each integer. Print a new line after printing the A integers
	public static void main(String[] args) {
//		int A=10;
		int A=9;
		solve(A);
	}

//	public static void solve(int A) {
//		if(A<1) {
//			return;
//		}
//		System.out.print(A+" ");
//		solve(A-1);
//
//    }
	
	
	public static  void printAto1(int A){
        if(A == 0){
            return;
        }
        System.out.print(A + " ");
        printAto1(A - 1);
    }
    public static void solve(int A) {
        printAto1(A);
        // below line should be added otherwise its failing
        System.out.print("\n");
    }
}

//Example Input
//
//Input 1:
//
//10
//
//Input 2:
//
//5
//
//Example Output
//
//Output 1:
//
//10 9 8 7 6 5 4 3 2 1 
//
//Output 2:
//
//5 4 3 2 1 
