package _Collection_Framework.queue.doubly_Ended_Queue;

import java.util.*;

//ArrayDeque
/*
 * An ArrayDeque (also known as an “Array Double Ended Queue”,
 *  pronounced as “ArrayDeck”) is a special kind of a growable array 
 *  that allows us to add or remove an element from both sides. 
 *  An ArrayDeque implementation can be used as a Stack (Last-In-First-Out) 
 *  or a Queue(First-In-First-Out)
 */
//Deque
/*
 * A double-ended queue (abbreviated to deque, pronounced deck) 
 * is an abstract data type that generalizes a queue, 
 * for which elements can be added to or removed from 
 * either the front (head) or back (tail).
 */
public class About_ArrayDeque {

	private List<Integer> deque = new ArrayList<Integer>();
	public void insertFront(int item){ 
		//add element at the beginning of the queue 
		System.out.println("adding at front: "+item); 
		deque.add(0,item); 
		System.out.println(deque); 
		} 
	public void insertRear(int item){ 
		//add element at the end of the queue 
		System.out.println("adding at rear: "+item); 
		deque.add(item);
		System.out.println(deque); 
		} 
	public void removeFront(){ 
		if(deque.isEmpty()){ 
			System.out.println("Deque underflow!! unable to remove.");
			return; } 
		//remove an item from the beginning of the queue 
		int rem = deque.remove(0);
		System.out.println("removed from front: "+rem); 
		System.out.println(deque); 
		} 
	public void removeRear(){ 
		if(deque.isEmpty()){ 
			System.out.println("Deque underflow!! unable to remove.");
			return;
			}
		//remove an item from the beginning of the queue 
		int rem = deque.remove(deque.size()-1); 
		System.out.println("removed from front: "+rem); 
		System.out.println(deque);
		} 
	public int peakFront(){ 
		//gets the element from the front without removing it 
		int item = deque.get(0); 
		System.out.println("Element at first: "+item); 
		return item; 
		} 
	public int peakRear(){ 
		//gets the element from the rear without removing it
		int item = deque.get(deque.size()-1); 
		System.out.println("Element at rear: "+item); 
		return item; 
		} 
	public static void main(String a[]){ 
		About_ArrayDeque deq = new About_ArrayDeque(); 
		deq.insertFront(4); 
		deq.insertRear(40); 
		deq.removeFront(); 
		deq.removeFront(); 
		deq.removeFront(); 
		deq.insertFront(57);
		deq.insertFront(61);
		deq.insertRear(48);
		deq.insertFront(10); 
		deq.removeRear(); 
		}
}


 