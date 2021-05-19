package _Collection_Framework.set;

import java.util.*;


/*
 * Given an array , find if there exists a subarray with sub equals to zero 
 * n< 10^5
 * 
 */
public class Zero_Sum_Subarray {

	public static void main(String[] args) {
		
		int [] a= {2,1,-3,4,2};
		int k=0;//subarray with sub equals to k ,let k=0 
		
		boolean found = false;
		// in O(n^2)
//		for(int i=0 ;i<a.length;i++) {
//			int sum =0;
//			for(int j=i;j<a.length;j++) {
//				sum+=a[j];
//				if (sum==0) {
//					found =true;
//					break;
//				}
//			}
//			if(found) break;
//		}
		
		// in O(n)
		 Set<Integer> s=new HashSet<>();
		 int sum=0;
		 for(int e:a) {
			 s.add(sum);
			 sum+=e;
			 if(s.contains(sum-k)) {
				 found =true;
				 break;
			 }
			 
		 }
		 
		System.out.println("found="+found);
	
	}

}
