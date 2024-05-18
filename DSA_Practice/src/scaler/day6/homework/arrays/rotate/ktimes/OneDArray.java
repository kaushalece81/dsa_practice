package scaler.day6.homework.arrays.rotate.ktimes;

public class OneDArray {
//	Since arrays are passed by reference in Java,
//	the modification made to arr inside the fun method affects the original array.
//
//	Correct answer -> 98 will get printed
		   static void fun(int[]arr) {
		       arr[3] = 98;
		       return;
		   }

		   public static void main(String args[]) {
		       int[]arr = {10,20,30,40,50};
		       fun(arr);
		       System.out.println(arr[3]);
		   }

}
