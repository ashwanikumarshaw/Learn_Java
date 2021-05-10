package _Collection_Framework.list.stack.MyStack;

import _Collection_Framework.list.linked_list.Mylinklist.Dummy_linkedlist;

public class Dummy_Stack<E> {
	private Dummy_linkedlist<E> li = new Dummy_linkedlist<>();

	void push(E e) {
		li.add(e);
	}

	E pop()   {
//		if(li.isEmpty()) {
//			throw new Exception("Stack is empty can't pop data");
//		}
		try {
			return li.removeLast();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	E peek() {
		try {
			return li.getLast();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
