package contest;
public class EmmaStringReverseInRangeWhereCharEncountered {
	public static void main(String[] args) {
		String solve = solve("hello world","o");
		System.out.println(solve);
	}
    public static String solve(String A, String B) {
        char[] ch=A.toCharArray();
        char[] findCh=B.toCharArray();
        char ch1=findCh[0];
        int n=ch.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(ch[i]==ch1){
               j=i; 
               break;
            }
        }
        reverseArrayByRange(ch,0,j);
        return new String(ch); 
        
    }
    private static void reverseArrayByRange(char[] ch,int i,int j){
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
    }
}
