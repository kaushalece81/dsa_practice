package scaler.dsa.day12.homework.bit.manipulation;

public class BinaryAddition {
	public static void main(String[] args) {
		 String str=addBinary("1010110111001101101000", "1000011011000000111100110");
		 System.out.println(str);
		 //int decimal = Integer.parseInt(binaryString, 2);
	}
	public static String addBinary(String A, String B) {
		int lengthA = A.length();
		int lengthB = B.length();
		if(lengthA>lengthB) {
			int count=lengthA-lengthB;
			for(int i=0;i<count;i++) {
				B="0"+B;
			}
		}else {
			int count=lengthB-lengthA;
			for(int i=0;i<count;i++) {
				A="0"+A;
			}
		}
		System.out.println(A);
		System.out.println(B);
		long n1 = Long.parseLong(A);
		long n2 = Long.parseLong(B);
		long ans = 0, mul = 1, carry = 0;
		while (n1 > 0 || n2 > 0 || carry > 0) {
			long d1 = n1 % 10;
			long d2 = n2 % 10;
			n1 = n1 / 10;
			n2 = n2 / 10;

			long sum = d1 + d2 + carry;
			long rem = sum % 2;
			carry = sum / 2;

			ans = ans + rem * mul;
			mul = mul * 10;
		}
		return String.valueOf(ans);
	}
}
