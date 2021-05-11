package _Collection_Framework.queue.priorityQueue;

import java.util.*;
/*
 * A priority queue is an abstract data type that behaves 
 * similarly to the normal queue except that each element has some priority, 
 * 
 * i.e., the element with the highest priority would come first in a priority queue. 
 * The priority of the elements in a priority queue will determine the order in 
 * which elements are removed from the priority queue.
 * 
 */

public class PriorityQueue_class {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq= new PriorityQueue<>();
		pq.add("Az");
		pq.add("Aa");
		pq.add("ac");
		pq.add("Ac");
		pq.add("aa");
		
		//random
		System.out.println(pq);
		
		// Priority
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
//#####################################################
		PriorityQueue<Integer> n= new PriorityQueue<>();
		
		n.add(5);
		n.add(54);
		n.add(1);
		n.add(2);
		n.add(1);
		
		System.out.println(n);
		System.out.println(n.peek());
		System.out.println(n.remove());
		System.out.println(n.remove());
		System.out.println(n.remove());
		
	}

}
