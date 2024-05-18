package com.array;

import java.util.Scanner;

public class MaxOfArrayElement {

	public static void main(String[] args) {
		// 10
		// 5 -3 7 6 2 1 8 3 0 4
//		int arr[] = {5,-3,7,6,2,1,8,3,0,4};
		Scanner sc=new Scanner(System.in);
		int length = sc.nextInt();
		int [] arr= new int[length];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
			System.out.println("a["+i+"]: "+arr[i]);
		}
		
		for(int a: arr) {
			if(a>max) {
				max=a;
			}
		}
		System.out.println("Max Element in the array is : "+max);

	}

}
