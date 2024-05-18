package scaler.dsa.day8.homework.carryforward;

public class CountAG {
	public static void main(String[] args) {
//		int solve = solve("ABCGAG");
		int solve = solve("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		System.out.println(solve);
	}
//    public static int solve(String A) {
//    	char[] charArray = A.toCharArray();
//    	int len=charArray.length;
//    	int count=0;
//    	for(int i=0;i<len;i++ ) {
//    		if(charArray[i]=='A') {
//				for (int j = i + 1; j < len; j++) {
//					if(charArray[j]=='G') {
//						count++;
//					}
//				}
//    		}
//    	}
//        return count;
//    }

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
                        result%=mod;
                        // So, to avoid overflow either declare result as long long int OR use explicit type casting (( long long ) n * m ) % M.
			}
    	}return result;
}}