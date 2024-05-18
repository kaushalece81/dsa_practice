package scaler.day4.classwork.factors.ap.gp;

public class Factors {

	public static void main(String[] args) {
		solve(19);

	}
	    public static int solve(int A) {
	       int length=(int)Math.sqrt(A);
	        int count=0;
	        for(int i=1;i<=length;i++){
	            if(A%i==0){
	                count++;
	                if(i!=A/i){
	                    count++;
	                 }
	            }
	        }
	        System.out.println(count);
	        return count;
	    }

}

//6
//
//1   6 count 1
//2	3
//3	2
//6	1
