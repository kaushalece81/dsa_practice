package com.array;

public class TestPassByValueIntegerArrayExample {

	public static void main(String[] args) {
		// your code goes here
		Integer[] i ={10};
		change(i);
		System.out.println(i[0]);

	}
	public static void change(Integer[] i)
	{
	i[0]=50;
	}
	

}
