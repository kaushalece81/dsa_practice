package com.array;

public class SwapTwoVariableValueWithoutTemp {

	public static void main(String[] args) {
		int x=22;
		int y=55;
		System.out.println("Before swap x: "+x+" y: "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap x: "+x+" y: "+y);
	}

}
