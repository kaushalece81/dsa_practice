package scaler.dsa.day18.classwork.MergeSortedIntervalProblem;

import java.util.ArrayList;
import java.util.List;

public class NonOverlappingIntervalInsertNewInterval {
//	Q3. Merge Intervals - 2
//	Problem Description
//
//	You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this new interval into the set of intervals (merge if necessary).
//
//	You may assume that the intervals were initially sorted according to their start times.
//	Problem Constraints
//
//	0 <= |intervals| <= 105
//
//	Input Format
//
//	First argument is the vector of intervals
//
//	second argument is the new interval to be merged
//
//	Output Format
//
//	Return the vector of intervals after merging 
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A=new ArrayList<>();
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(3);
		A.add(ar1);
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ar2.add(6);
		ar2.add(9);
		A.add(ar2);
		ArrayList<Integer> B=new ArrayList<Integer>();
		B.add(2);
		B.add(5);
		ArrayList<ArrayList<Integer>> list=insert(A,B);
		System.out.println(list);
		
	}
	
	// not successful
//    public static ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B) {
//    	int n = A.size();
//		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
//		int L=B.get(0);
//		int R = B.get(1);
//		for(int i=0;i<n;i++) {
//			if(A.get(i).get(1)>L) {
//				ArrayList<Integer> list=new ArrayList<>();
//				list.add(A.get(i).get(0));
//				list.add(A.get(i).get(1));
//				ans.add(list);
//			}else if(R<A.get(i).get(0)) {
//				ArrayList<Integer> list=new ArrayList<>();
//				list.add(L);
//				list.add(R);
//				ans.add(list);
//				for(int j=i;j<n;j++) {
//					ArrayList<Integer> list1=new ArrayList<>();
//					list1.add(A.get(j).get(0));
//					list1.add(A.get(j).get(1));
//					ans.add(list1);
//				}
//				return ans;
//			}else {
//				L=Math.min(L, A.get(i).get(0));
//				R=Math.min(R, A.get(i).get(1));
//			}
//		}
//		
//		ArrayList<Integer> list=new ArrayList<>();
//		list.add(L);
//		list.add(R);
//		ans.add(list);
//		return ans;
//    }
    
    public static ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> intervals, ArrayList<Integer> newInterval) {
        int start = newInterval.get(0);
        int end = newInterval.get(1);
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < intervals.size(); i++) {
            ArrayList<Integer> in = intervals.get(i);

            if (start >= in.get(0) && start <= in.get(1))
                startIndex = i;

            if (end >= in.get(0) && end <= in.get(1))
                endIndex = i;
        }

        // Endpoints of new interval don't lie inside any other interval
        if (startIndex == -1 && endIndex == -1) {
            startIndex = 0;

            for (int i = 0; i < intervals.size(); i++) {
                if (start > intervals.get(i).get(1)) {
                    startIndex = i + 1;
                }
            }

            endIndex = intervals.size() - 1;
            for (int i = intervals.size() - 1; i >= 0; i--) {
                if (end < intervals.get(i).get(0)) {
                    endIndex = i - 1;
                }
            }

            // Intervals between startIndex and endIndex lie completely inside the new interval
            for (int i = startIndex; i <= endIndex; i++) {
                intervals.remove(startIndex);
            }

            intervals.add(startIndex, newInterval);
            return intervals;
        }

        if (startIndex == -1) {
            for (int i = intervals.size() - 1; i >= 0; i--) {
                if (start <= intervals.get(i).get(0))
                    startIndex = i;
            }
        }

        if (endIndex == -1) {
            for (int i = 0; i < intervals.size(); i++) {
                if (end >= intervals.get(i).get(1))
                    endIndex = i;
            }
        }

        start = Math.min(intervals.get(startIndex).get(0), start);
        end = Math.max(intervals.get(endIndex).get(1), end);
        intervals.get(startIndex).set(0, start);
        intervals.get(startIndex).set(1, end);

        for (int i = startIndex + 1; i <= endIndex; i++) {
            intervals.remove(startIndex + 1);
        }

        return intervals;
    }

}

//Example Input
//
//Input 1:
//
//Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
//
//Input 2:
//
//Given intervals [1, 3], [6, 9] insert and merge [2, 6] .
//
//
//
//Example Output
//
//Output 1:
//
// [ [1, 5], [6, 9] ]
//
//Output 2:
//
// [ [1, 9] ]
//
//
//
//Example Explanation
//
//Explanation 1:
//
//(2,5) does not completely merge the given intervals
//
//Explanation 2:
//
//(2,6) completely merges the given intervals
