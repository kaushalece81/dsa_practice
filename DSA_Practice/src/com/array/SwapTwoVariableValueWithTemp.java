package com.array;

public class SwapTwoVariableValueWithTemp {

	public static void main(String[] args) {
		int x=22;
		int y=55;
		System.out.println("Before swap x: "+x+" y: "+y);
		swap(x,y);
		System.out.println("After swap x: "+x+" y: "+y); //not swapped as stored in stack and pass by value will not replace
	}
	
	private static void swap(int x,int y) {
		int temp=x;
		x=y;
		y=temp;
		System.out.println("inside swap function After swap x: "+x+" y: "+y);
	}

}
