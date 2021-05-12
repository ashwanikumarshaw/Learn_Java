package _Collection_Framework.queue.doubly_Ended_Queue;
/*
 * You are given an array of integers nums, 
 * there is a sliding window of size k which is moving from the very left of the array to the very right. 
 * You can only see the k numbers in the window. Each time the sliding window moves right by one position.

	Return the max sliding window.
	
	Example :

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
 
 */

import java.util.*;

public class Sliding_Window_Maximum {
	
	 public static int[] maxSlidingWindow(int[] a, int k) {
		 
		 int n=a.length;
		 if (n == 0) {
				return a;
			}

			Deque<Integer> dq = new LinkedList<>();
			int ans[] = new int[n - k + 1];

			int i = 0;
			for (; i < k; i++) {
				// Adding the index of element in decreasing order of the number present at the
				// index till k
				/*
				 * If a number at index 2 is greater than the number at index 1 then remove the
				 * index 1 and add 2 at the place
				 */
				/*
				 * Keep on removeing the index till the number at the index you want to insert
				 * is greater than the present index number in the dqueue
				 */
				while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}

			for (; i < n; i++) {
				// Adding the max value in first window to answer array
				ans[i - k] = a[dq.peekFirst()];

				// Chechking if the index in the queue is out of the window we are current in.
				// If yes remove the the index from the front
				while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
					dq.removeFirst();
				}

				/*
				 * Doing the same thing of chechking the value of current index is greater than
				 * the value of index present in the dequeue
				 */
				while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}

			ans[i - k] = a[dq.peekFirst()];

			// Returning the ans Array.
			return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,-1,-3,5,3,6,7};
		int[] arr= maxSlidingWindow(a ,3 );
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		

	}

}
