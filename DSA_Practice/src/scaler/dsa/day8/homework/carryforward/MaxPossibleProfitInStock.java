package scaler.dsa.day8.homework.carryforward;

import java.util.Arrays;
import java.util.List;

public class MaxPossibleProfitInStock {

	public static void main(String[] args) {
		int [] arr=new int[] {1, 4, 5, 2, 4};
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		int maxProfit = maxProfit(list);
		System.out.println(maxProfit);

	}
	 public static int maxProfit(final List<Integer> A) {
		
		 return 1;
	 }
}
