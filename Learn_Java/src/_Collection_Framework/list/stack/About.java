package _Collection_Framework.list.stack;

import java.util.Iterator;
import java.util.Stack;

public class About {
	/*
	 * In Java, Stack is a class that falls under 
	 * the Collection framework that extends the Vector class. 
	 * It also implements interfaces List, Collection, Iterable, 
	 * Cloneable, Serializable. It represents the LIFO stack of
	 * objects. Before using the Stack class, we must import the 
	 * java.util package. 
	 * 
	 * The stack class arranged in the Collections framework hierarchy
	 * 
	 * Iterable
	 * 	   |
	 * Collection
	 *   |
	 * List -> Vector -> Stack
	 * 
	 * create a stack :
	 * 	Stack<E> stk = new Stack<>();  
	 * 
	 * Important methods :
	 *  push(E item)
	 *  pop()
	 *  peek()
	 *  search(Object o)
	 *  empty() 
	 *  
	 *  Implement :
	 *  stk.push(item); // push element at top
	 *  stk.pop();// pop element from top
	 *  E var = stk.peek();// return top element
	 *  boolean result = stk.empty(); // return is empty or not
	 *  int location = stk.search(item);  // search for element
	 *  
	 */
	    
	public static void main (String[] args)   
	{   
	//creating an object of Stack class  
	Stack<String> stk = new Stack<String>();  
	//pushing elements into stack  
	stk.push("BMW");  
	stk.push("Audi");  
	stk.push("Ferrari");  
	stk.push("Bugatti");  
	stk.push("Jaguar");  
	//iteration over the stack  
	Iterator<String> iterator = stk.iterator();  
	while(iterator.hasNext())  
	{  
	Object values = iterator.next();  
	System.out.println(values);   
	}
	
	System.out.println();
	stk.forEach(n ->{ System.out.println(n);});

	System.out.println();
	for(String animal:stk)    
	    System.out.println(animal); 
	}  
}
