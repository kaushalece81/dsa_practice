package scaler.dsa.day12.homework.bit.manipulation;
public class BinaryAditionString {
	public static void main(String[] args) {
		String str=addBinary("1010110111001101101000", "1000011011000000111100110");
		 System.out.println(str);
	}
	
	//working solution
    public static String addBinary(String A, String B) {
       StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = A.length() - 1;
        int j = B.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += A.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += B.charAt(j--) - '0';
            }
            sb.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            sb.insert(0, carry);
        }

        return sb.toString();
    }
    
    // Complete solution
//	public String addBinary(String A, String B) {
//		int nA, nB;
//		char res[];
//		int i, j, k;
//		nA = A.length();
//		nB = B.length();
//		res = new char[Math.max(nA, nB) + 1];
//		k = Math.max(nA, nB);
//		i = nA - 1;
//		j = nB - 1;
//		int sum = 0, carry = 0;
//		// we add bits from the rightmost bit to the leftmost bit
//		while (i >= 0 || j >= 0 || carry != 0) {
//			sum = carry;
//			if (i >= 0)
//				sum += (A.charAt(i) - '0');
//			if (j >= 0)
//				sum += (B.charAt(j) - '0');
//			res[k] = (char) ((sum % 2) + '0');
//			carry = sum / 2;
//			i--;
//			j--;
//			k--;
//		}
//		if (res[0] == '1')
//			return new String(res);
//		int len = Math.max(nA, nB);
//		return new String(res, 1, len);
//	}
}







