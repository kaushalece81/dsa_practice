package contest;
public class StringOperationsConcatDeleteReplace {
	public static void main(String[] args) {
		solve("aeiOUz");
	}
    public static String solve(String A) {
       A=A.concat(A);
       char[] ch= A.toCharArray();
       int size=ch.length;
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<size;i++){
    	   if(!(ch[i]>='A' && ch[i]<='Z')){
               sb.append(ch[i]);
           }
       }
       char[] chArray=sb.toString().toCharArray();
       for(int i=0;i<chArray.length;i++){
          // replace aeiou with #
           if(chArray[i]=='a' || chArray[i]=='e' || chArray[i]=='i' || chArray[i]=='o'|| chArray[i]=='u'){
        	   chArray[i]='#';
           }
       }  
       System.out.println(new String(chArray));
       return "";
       
    }
}
