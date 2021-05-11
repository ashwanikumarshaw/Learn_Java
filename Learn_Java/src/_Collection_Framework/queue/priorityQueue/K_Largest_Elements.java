package _Collection_Framework.queue.priorityQueue;

import java.util.*;


/*
 * Problem Description

	Given an 1D integer array A of size N you have to find and return the B largest elements of the array A.

	NOTE: Return the largest B elements in any order you like.

 */
public class K_Largest_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t--!=0) {
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i =0;i<n;i++)
				a[i]=sc.nextInt();
			int b=sc.nextInt();
			PriorityQueue<Integer> pq=new PriorityQueue<>();
			

			for(int i =0;i<n;i++) {
				if(i<b) {
					pq.add(a[i]);
				}
				else{
					if(pq.peek()<a[i]) {
						pq.poll();
						pq.add(a[i]);
					}
					
				}
			}
			ArrayList<Integer> ar=new ArrayList<>(pq);
			Collections.sort(ar,Collections.reverseOrder());
			for(int i:ar)
				System.out.println(i);
			
			
		}
		sc.close();

	}

}
