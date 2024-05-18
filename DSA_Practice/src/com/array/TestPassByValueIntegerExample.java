package com.array;

public class TestPassByValueIntegerExample {

	public static void change(Integer i) {
		i = 50;  // is equal to writing i=new Integer(50);
	}

	public static void main(String[] args) {
		// your code goes here
		Integer i = 10;
		change(i);
		System.out.println(i);

	}

}
