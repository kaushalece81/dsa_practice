package scaler.dsa.day8.classwork.carryForward;

public class CountPairsAGBruitForce {

	public static void main(String[] args) {
		//String str="abegag";
		String str="acgdgag";
		int countPairs=countAG(str);
		System.out.println(countPairs);

	}

	private static int countAG(String str) {
		char[] ch = str.toCharArray();
		int length = ch.length;
		int count=0;
		for(int i=0;i<length;i++) {
			if(ch[i]=='a') {
				for(int j=i+1;j<length;j++) {
					if(ch[j]=='g') {
						count++;
					}
				}
			}
		}
		return count;
	}

}
