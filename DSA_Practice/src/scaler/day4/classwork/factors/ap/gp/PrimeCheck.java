package scaler.day4.classwork.factors.ap.gp;

public class PrimeCheck {

	public static void main(String[] args) {
		System.out.println(countPrimeNumberBelowNumbers(19));
	   }
	
    public static int countPrimeNumberBelowNumbers(int A) {
        int count =0;
		 for(int i=1;i<=A/i;i++){
			if(A%i==0){
                count++;
                if(i!=A/i){
                    count++;
                }
            }
		 }
         return count;
    }
}
