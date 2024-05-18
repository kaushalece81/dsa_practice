package bharat.codingproblem;

import java.util.HashMap;

public class CharCounter {
// count characters in sentence
	public static void main(String[] args) {
		String str="I am creator of my destiny!!";
		var map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int count=0;
			if(map.containsKey(ch)) {
				count=map.get(ch);				
			}
			count++;
			map.put(ch, count);
		}
		System.out.println(map);

	}

}
