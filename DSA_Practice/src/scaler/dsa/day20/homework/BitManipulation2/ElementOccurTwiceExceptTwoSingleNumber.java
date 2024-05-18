package scaler.dsa.day20.homework.BitManipulation2;
public class ElementOccurTwiceExceptTwoSingleNumber {
	public static void main(String[] args) {
		int [] A=new int[] {4,5,4,1,6,5,2};//1,2

		int singleNumber = singleNumber(A);
		System.out.println(singleNumber);
	}
    public static int singleNumber(final int[] A) {
    	int xor_for_all=0;
    	int size= A.length;
    	for(int i=0;i< size;i++) {
    		xor_for_all=xor_for_all^A[i];
    	}
    	int pos=0;
    	for(pos=0;pos<32;pos++) {
    		if(checkBit(xor_for_all, pos)==1) {
    			break;
    		}
    	}
    	int x=0;
    	int y=0;
    	for(int i=0;i< size;i++) {
    		if(checkBit(A[i], pos)==1) {
    			y=y^A[i];
    		}else {
    			x=x^A[i];
    		}
    	}
    	System.out.println("x="+x+", y="+y);
    	return 0;
    }
    private static  int checkBit(int n, int i) {
    	if(((n>>i)&1)==0) {
    		return 0;
    	}
    	return 1;
    }
}
