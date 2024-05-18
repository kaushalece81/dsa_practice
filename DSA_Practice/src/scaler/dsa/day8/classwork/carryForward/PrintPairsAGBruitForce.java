package scaler.dsa.day8.classwork.carryForward;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintPairsAGBruitForce {

	public static void main(String[] args) {
		//String str="abegag";
		String str="acgdgag";
		Set<String> pairs=countAG(str);
		for (String pair:pairs) {
			System.out.println(pair);
		}

	}

	private static Set<String> countAG(String str) {
		char[] ch = str.toCharArray();
		Set<String> set=new LinkedHashSet<>();
		int length = ch.length;
		for(int i=0;i<length;i++) {
			if(ch[i]=='a') {
				for(int j=i+1;j<length;j++) {
					if(ch[j]=='g') {
						set.add("i="+i+" ,"+j);
					}
				}
			}
		}
		return set;
	}

}
