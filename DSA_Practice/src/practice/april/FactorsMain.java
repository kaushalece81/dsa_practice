package practice.april;

public class FactorsMain {

	public static void main(String[] args) {
		int n=29;
		int factors=findFactors(n);
		System.out.println(factors);
		boolean isPrime =checkPrime(factors);
		System.out.println(isPrime);

	}

	private static boolean checkPrime(int factors) {
		return factors==2;
	}

	private static int findFactors(int n) {
		int count=0;
		for(int i=1;i<=n/i;i++) {
			if(n%i==0) {
				count++;
				if(i!=n/i) {
					count++;
				}
			}
		}
		return count;
	}

}
