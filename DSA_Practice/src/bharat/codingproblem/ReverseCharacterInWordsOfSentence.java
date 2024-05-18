package bharat.codingproblem;

public class ReverseCharacterInWordsOfSentence {

	public static void main(String[] args) {
		String str="Java is Awesome";
		StringBuilder reversed=reverseCharactersInWords(str);
		System.out.println(reversed.toString());

	}

	private static StringBuilder reverseCharactersInWords(String str) {
		StringBuilder sb=new StringBuilder();
		String[] split = str.split(" ");
		for(String word:split) {
//			sb.append(reverseWord(word)+" ");
			sb.append(new StringBuilder(word).reverse()+" ");
		}
		return sb;
	}

//	private static StringBuilder reverseWord(String word) {
//		StringBuilder sb=new StringBuilder();
//		int length = word.length();
//		for(int i=0;i<length;i++) {
//			sb.append(word.charAt(length-i-1));
//		}
//		return sb;
//	}

}
