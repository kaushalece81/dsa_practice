package scaler.day4.classwork.factors.ap.gp;
public class PrintAllPrimeNumberTillRange {
	public static void main(String[] args) {
	System.out.println(solve(19));	
	}
    public static int solve(int A) {
        int count=0;
        for(int i=2;i<=A;i++){
            if(checkPrime(factors(i))){
                count++;
            }
        }
        return count;
    }

     public static int factors(int A) {
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
	        return count;
	    }
	   private static boolean checkPrime(int factors){
	    	return factors==2;
	   }
}
