package _Collection_Framework.list.stack.MyStack;

public class MainClass {

	public static void main(String[] args) {
		Dummy_Stack<Integer> var=new Dummy_Stack<>();
//		var.pop();
//		var.peek();
		var.push(45);
		var.push(8);
		var.push(87);
		var.push(39);
		var.push(1);
		var.pop();
		System.out.println(var.peek());		

	}

}
