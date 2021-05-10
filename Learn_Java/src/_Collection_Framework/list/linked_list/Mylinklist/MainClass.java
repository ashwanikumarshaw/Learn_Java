package _Collection_Framework.list.linked_list.Mylinklist;

public class MainClass {

	public static void main(String[] args) {
		Dummy_linkedlist<Integer> list=new Dummy_linkedlist<>();
		list.print();
		//try removing last data from an empty list 
//		try {
//			list.removeLast();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//list.add(45);
		for(int i=1;i<11;i++)
			list.add(i);
		
		list.print();
		//remove last data
		try {
			list.removeLast();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		list.print();
		
		System.out.println();
		try {
			System.out.println(list.getLast());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
