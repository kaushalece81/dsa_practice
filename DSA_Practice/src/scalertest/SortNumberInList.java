package scalertest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class SortNumberInList {

	public static void main(String[] args) {
		 List<Integer> list = List.of(54,-52,15,23,-97,12,-64,52,85);
		 List<Integer> collectAscending = list.stream().sorted().collect(Collectors.toList());
		 System.out.println("collectAscending: "+ collectAscending);

		 //List<Integer> collectDescending = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 // replace collect(Collectors.toList()) by stream.toList()
		 List<Integer> collectDescending = list.stream().sorted(Comparator.reverseOrder()).toList();
		 System.out.println("collectDescending: "+ collectDescending);
		 
		 
		// Find Maximum in arraylist
		 Integer max = Collections.max(list);
		 System.out.println("max: "+max);
		 int max1 = list.stream().mapToInt(a->a).max().orElseThrow(NoSuchElementException::new);
		 System.out.println("max1: "+max1);
		// Find Minimum in arraylist
		 Integer min = Collections.min(list);
		 System.out.println("min: "+min);
		 int min1 = list.stream().mapToInt(a->a).min().orElseThrow(NoSuchElementException::new);
		 System.out.println("min1: "+min1);
		 
		 
		 int max2 = list.stream().sorted().max(Comparator.comparing(Integer::valueOf)).get();
		 System.out.println("max2: "+max2);
		 
		 //sort in ascending order
		 Comparator<Integer> c=(a,b)-> a.compareTo(b);
		 int max3 = list.stream().max(c).get();
		 System.out.println("max2: "+max2);
	}

}
