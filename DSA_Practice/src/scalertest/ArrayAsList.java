package scalertest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAsList {

	public static void main(String[] args) {
		int [] array={54,-52,15,23,-97,12,-64,52,85};
		Arrays.stream(array).boxed().forEach(System.out::println);
		System.out.println("=====================");
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		list.forEach(System.out::println);


	}

}
