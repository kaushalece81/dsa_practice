package contest;
public class Solutions2 {
	public static void main(String[] args) {
		int[] A=new int[] {30,25,40,35,20,45,50,55,22,18,15};
		int ans=solve(A, 3, 30);
		System.out.println("ans="+ans);
		
	}
    public static  int solve(int[] A, int B, int C) {
        int size=A.length;
        int ans=0;
        int [] avgPrefix=new int[size-B+1];
        for(int i=0;i<size;i++){
            int j=i;
            int sum=0;
            int avg=0;
            int counter=1;

            if(i==(size-B+1)) {
            	break;
            }
            System.out.println("(j)="+(j));
            StringBuilder sb=new StringBuilder();
            while(counter<=B && j < size){
                sum=sum+A[j];
                sb.append(A[j]).append(",");
                counter++;
                j++;
               
            }
            if(sum>0) {
            avg=Math.floorDiv(sum, B);
            System.out.println("sb="+sb+" sum="+sum);
            System.out.println("sb="+sb+" avg="+avg);
            avgPrefix[i]=avg;
            }
            
        }
        System.out.println(avgPrefix);
        int sizeAvg=avgPrefix.length;
        for(int i=0;i<sizeAvg;i++){
            if(avgPrefix[i]<C){
                return 1;
            }
        }
   return 0;
        
    }
}