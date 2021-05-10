package _Collection_Framework.queue;

import java.util.*;

/*
 * The Queue is used to insert elements at the end 
 * of the queue and removes from the beginning of the queue. 
 * It follows FIFO concept.
 * 
 */
public class About_Queue {
	
	/*
	 * Methods of Queue:
	 * ( throw Exception )
	 * 		add()
	 * 		remove()
	 * 		element()
	 * ( return false/null )
	 * 		offer()
	 * 		poll()
	 * 		peek()
	 */
		public static void main(String[] args) {
			Queue<Integer> q=new LinkedList<>();
			System.out.println(q.poll());
			//System.out.println(q.remove());
		q.add(54);
		q.add(84);
		q.offer(78);
		q.offer(12);
		
		for (Integer i : q) {
			System.out.println(i);	
		}
		System.out.println();
		q.remove();//remove 54
		q.poll();//removed 84
		System.out.println(q.peek());
		System.out.println(q.element());
		}
}
