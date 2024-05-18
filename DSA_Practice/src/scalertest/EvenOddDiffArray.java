package scalertest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOddDiffArray {

	public static void main(String[] args) {

		 List<Integer> A = List.of(54,-52,15,23,-97,12,-64,52,85);
	     List<Integer> evenNumberList=A.stream().filter(a->a%2==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    int evenMax = A.stream().filter(a->a%2==0).sorted(Comparator.reverseOrder()).mapToInt(a->a).max().orElseThrow(NoSuchElementException::new);
	    int oddMin = A.stream().filter(a->a%2!=0).sorted().mapToInt(a->a).min().orElseThrow(NoSuchElementException::new);
	    System.out.println("evenMax "+evenMax);
	    System.out.println("oddMax "+oddMin);
	    System.out.println("Diff : "+(evenMax-oddMin));
	     List<Integer> oddNumberList=A.stream().filter(a->a%2!=0).sorted().collect(Collectors.toList());

	     evenMax=evenNumberList.get(0);
	     oddMin=oddNumberList.get(0);
	    System.out.println("evenNumberList"+evenNumberList);
	    System.out.println("oddNumberList"+oddNumberList);
	    
	    System.out.println("evenMax"+evenMax);
	    System.out.println("oddMax"+oddMin);
	    
	    System.out.println("Diff : "+(evenMax-oddMin));

	}

}
