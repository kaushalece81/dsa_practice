package scaler.day4.classwork.factors.ap.gp;

public class PrimeNumberCheckUsingFactors {

	public static void main(String[] args) {
		int factors = factors(2);
		System.out.println(checkPrime(factors));
	}
	// optimized
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
	        System.out.println(count);
	        return count;
	    }
	   private static boolean checkPrime(int factors){
	    	return factors==2;
	   }

}
