package scaler.dsa.day20.homework.BitManipulation2;

import java.util.ArrayList;

public class FindPairMaximum {

	public static void main(String[] args) {
		ArrayList<Integer> A=new ArrayList<>();
		A.add(53);
		A.add(39);
		A.add(88);
		int ans=solve(A);
		System.out.println(ans);
	}
	
	   public static int solve(ArrayList<Integer> A) {
	          ArrayList < Integer > v = new ArrayList < Integer > ();
	        for (int it : A) 
	            v.add(it);
	        for (int i = 29; i >= 0; i--) {
	            // create a set of elements with the i-th bit set
	            ArrayList < Integer > v2 = new ArrayList < Integer > ();
	            for (int it : v)
	                if ((it & (1 << i)) != 0) 
	                    v2.add(it);
	            if (v2.size() >= 2) {
	                v.clear();
	                for (int it: v2) 
	                    v.add(it);
	            }
	        }
	        return (int)(v.get(0) & v.get(1));
	    }

}
