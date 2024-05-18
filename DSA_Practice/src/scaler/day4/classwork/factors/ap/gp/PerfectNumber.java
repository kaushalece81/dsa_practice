package scaler.day4.classwork.factors.ap.gp;

public class PerfectNumber {
	public static void main(String[] args) {
	System.out.println(solve(4));
	System.out.println(solve(6));
	System.out.println(solve(9));
	System.out.println(solve(24));
	}
	
//	For example, the number 6 is a perfect number because its proper divisors (excluding 6 itself) are 1, 2, and 3, and 
//	1+2+3=6


	public static int solve(int A) {
		  int sum=0;
	        int perfectNumber=0;
	        for(int i=1;i<A;i++){
	            if(A%i==0){
	                sum=sum+i;
	            }
	        }
            if(A==sum){
            	perfectNumber=1;
                return perfectNumber;
            } 
	        return perfectNumber;
    }
}
