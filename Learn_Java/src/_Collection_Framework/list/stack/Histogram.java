package _Collection_Framework.list.stack;
/*
 * Given n positive integer representing the histogram's bar height
 * find the maximum sum of largest rectangle in the histogram
 * 
 * example:
 * input : 2156
 * output : 10
 * 
 * exp:
 * 5->6 makes the biggest rectangle of 5,5
 * 
 * example:
 * input : 3527
 * output : 8
 * 
 * exp:
 * 3->2->5 makes the biggest rectangle of 2,2,2
 * 
 */
import java.util.*;

public class Histogram {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		 int[] height={2,1,5,6};//sc.nextInt();
		 sc.close();
		 if (height == null || height.length == 0) {
				System.out.println(0);
			}
		 
			Stack<Integer> stack = new Stack<Integer>();
		 
			int max = 0;
			int i = 0;
		 
			while (i < height.length) {
				//push index to stack when the current height is larger than the previous one
				if (stack.isEmpty() || height[i] >= height[stack.peek()]) {
					stack.push(i);
					i++;
				} else {
				//calculate max value when the current height is less than the previous one
					int p = stack.pop();
					int h = height[p];
					int w = stack.isEmpty() ? i : i - stack.peek() - 1;
					max = Math.max(h * w, max);
				}
		 
			}
		 
			while (!stack.isEmpty()) {
				int p = stack.pop();
				int h = height[p];
				int w = stack.isEmpty() ? i : i - stack.peek() - 1;
				max = Math.max(h * w, max);
			}
		 
			System.out.println(max); 
	}
	
//bugged
	
}
