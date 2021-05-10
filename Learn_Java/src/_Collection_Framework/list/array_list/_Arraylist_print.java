package _Collection_Framework.list.array_list;

import java.util.*;

public class _Arraylist_print {

	public static void main(String[] args) {


		 List<String> list=new ArrayList<>();//Creating arraylist    
	      list.add("Dog");//Adding object in arraylist    
	      list.add("Cat");      
	      list.add("lion"); 
	      list.add("fox");
	     
	     List<String> list2=new LinkedList<>(); 
	     list2.add("Ashu");
	     list2.add("Aish");
	     list2.add("RAj");
	    // list2.add(54); Error only string
	     
	     list2.addAll(list);
	     
		System.out.println();
		
	      //Traversing list through Iterator  
	    Iterator<String> itr = list.iterator();//getting the Iterator 
	    
	      while(itr.hasNext()){//check if iterator has the elements  
	       System.out.println(itr.next());//printing the element and move to next  
	      }
	      
	      
	      System.out.println();
	     //for loop 
	      for(String animal:list2)    
	    	    System.out.println(animal); 
	      
	      //foreach
	      System.out.println();
	      System.out.println("forEach:");
	      list2.forEach(n ->{ System.out.println(n);});
	}

}
