package _Collection_Framework.queue.MyQueue;

public class MainClass {

	public static void main(String[] args) {

		Dummy_Queue<Integer> q=new Dummy_Queue<>();
		System.out.println(q.dequeue());
		q.enqueue(45);
		q.enqueue(9);
		q.enqueue(78);
		q.enqueue(32);
		System.out.println(q.dequeue());
		
	}

}
