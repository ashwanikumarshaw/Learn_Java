package _Collection_Framework.list.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class _Arraylist {

	 public static void main(String args[]){  
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
		      list.add("Dog");//Adding object in arraylist    
		      list.add("Cat");    
		      list.add("Goat");    
		      list.add("Elephant"); 
		      list.add("Elephant");
		      list.add("Horse");
		      //Printing the arraylist object   
		      System.out.println(list);  
		      
		      System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0  
		      //changing the element  
		      list.set(1,"Ant");  
		      System.out.println("Returning element: "+list.get(1));
		      
		      
		      System.out.println();
		      System.out.println("Sorting the list ");
		      //Sorting the list  
		      Collections.sort(list);
		      for(String animal:list)    
		    	    System.out.println(animal);  
		 }  

}
