package scaler.dsa.day8.homework.carryforward;

public class CountTimesAGSequenceExistInString {
	public static void main(String[] args) {
		String str="ABCGAG";
		int l=solve(str);
		System.out.println(l);
	}
    public static int solve(String A) {
	    	char[] charArray = A.toCharArray();
	    	int len=charArray.length;
            int mod=1000000007;
	    	int result=0;
	    	int count_a=0;
	    	for(int i=0;i<len;i++ ) {
	    		if(charArray[i]=='A') {
	    			count_a+=1;
	    		}
				else if(charArray[i]=='G') {
							result+=count_a;
                            result=result%mod;
				}
	    	}return result;
    }
}