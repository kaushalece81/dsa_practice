package bharat.codingproblem;

import java.util.ArrayList;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		String str="aaaaabbbbbcccccdddddeeee";
		StringBuilder sb=new StringBuilder();
		var list=new ArrayList<Character>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!list.contains(ch)) {
				list.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(list);
		System.out.println(sb.toString());
		
		
	}

}
