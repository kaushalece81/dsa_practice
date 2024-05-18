package bharat.codingproblem;

public class PyramidPattern {

	public static void main(String[] args) {
		int num=6;
//		for(int i=1;i<=num;i++) {
//			for(int j=num;j>0;j--) {
//				if(j==i) {
//					System.out.print("* ");
//				}
////				else {
////					System.out.print("  ");
////				}
//			}
//			System.out.println();
//		}
		
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print("#");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
// #####*
// ####*#*
// ###*#*#*
// ##*#*#*#*
// #*#*#*#*