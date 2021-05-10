package _Collection_Framework.list.linked_list.Mylinklist;

public class Dummy_linkedlist <E>{
	
	//Node for linked list
	public static class Node<E>{
		public E data;
		 public Node<E> next;
		 public Node(E data){
			this.data=data;
			next=null;
		}
		
	}
	
	//Head points 1st element 
	Node<E> head;
	
	//Add at end
	public void add(E data ) {
		//create a node with data =data and next =null
		Node<E> toAdd=new Node<E>(data);
		//check head is null if null make head =toAdd data
		if(isEmpty()) {
			head=toAdd;
			return;
			}
		//if head is not null find last element whose next is null
		Node<E> temp=head;
		while(temp.next!=null)
			temp=temp.next;
		//Now link the toAdd node to the last node 
		temp.next=toAdd;
	}
	
	//check Head is empty or not 
	public boolean isEmpty() {
		return head==null;
	}
	
	//Remove last 
	public E removeLast() throws Exception {
		//if head is not null find last element whose next is null
				Node<E> temp=head;
				if(temp==null){
					throw new Exception("Stack is empty can't pop data");
				}
				if(temp.next==null){
					E lastData=head.data;
					head=null;
					return lastData;				
				}
				while(temp.next.next!=null)
					temp=temp.next;
				//Now link the toAdd node to the last node 
			E lastData= temp.data;
			temp.next=null;
			return lastData;
			
	}

	public E getLast() throws Exception {
		Node<E> temp = head;
		if (temp == null) {
			throw new Exception("Stack is empty can't peek data");
		}
		while (temp.next != null)
			temp = temp.next;
		// Now link the toAdd node to the last node
		E lastData = temp.data;
		return lastData;
	}

	//print all the element in linked list
	void print() {
		// check head is null if null make head =toAdd data
		if (isEmpty()) {
			System.out.println("Underflow! - linkedlist is empty");
			return;
		}
		// if head is not null find last element whose next is null
		Node<E> temp = head;
		while (temp!= null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
			}
	}
	
}
