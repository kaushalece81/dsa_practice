package scaler.dsa.day8.classwork.carryForward;

public class CountPairsAGOptimized {

	public static void main(String[] args) {
		String str="abegag";
		//String str="acgdgag";
		//String str="acbagkagg";
		//String str="ggabegag";
		int countPairs=countAG(str);
		System.out.println(countPairs);

	}

	private static int countAG(String str) {
		char[] ch = str.toCharArray();
		int length = ch.length;
		int countAns=0;
		int countOfA=0;
		for(int i=0;i<length;i++) {
			if(ch[i]=='a') {
				countOfA++;
			}
			else if(ch[i]=='g') {
				countAns=countAns+countOfA;
			}
		}
		return countAns;
	}

}
