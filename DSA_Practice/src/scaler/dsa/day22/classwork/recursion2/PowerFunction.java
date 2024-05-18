package scaler.dsa.day22.classwork.recursion2;

public class PowerFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



//Method 1:
//public class Solution {
//	public int pow(int x, int n, int d) {
//	    long a = x;
//	    long res = 1L;
//	    while (n > 0) {
//	        if (n % 2 == 1) {
//	            res *= a;
//	            res %= d;
//	        }
//	        a *= a;
//	        a %= d;
//	        n = n >> 1;
//	    }
//	    res = (res + d) % d;
//	    return (int) res;
//	}
//}

//Method 2:
//public class Solution {
//    public int pow(int A, int B, int C) {
//        if(A == 0)
//            return 0;
//        if(B == 0)
//            return 1;
//        long ans = pow(A, B / 2, C);
//        ans = (ans * ans) % C;
//        if(B % 2 == 1)
//            ans = (ans * A);
//        ans = (ans + C) % C;
//        return (int)ans;
//    }
//}
