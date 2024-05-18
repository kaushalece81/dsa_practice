package scaler.dsa.day8.homework.carryforward;
public class AllPossibleSubArray {
	public static void main(String[] args) {
		int[] A=new int[] {1, 2, 3};
		solve(A);
	}
    public static int[][] solve(int[] A) {
      //  int[][] arr=new int[][];
        int len=A.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
               for(int k=i;i<=j;k++){
            	   System.out.print("i="+i+" , j="+j+", k="+k);
                  System.out.print(" A[k]=  "+A[k] +" ");
               }
               System.out.println();
            }
        }
        
        return null;

    }
}
