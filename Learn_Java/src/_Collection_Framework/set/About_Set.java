package _Collection_Framework.set;
import java.util.*;

/*
 * The set interface present in the java.util package 
 * and extends the Collection interface is an unordered collection of objects 
 * in which duplicate values cannot be stored. 
 * It is an interface which implements the mathematical set. 
 * This interface contains the methods inherited from the 
 * Collection interface and adds a feature which restricts 
 * the insertion of the duplicate elements.
 * 
 * 
 * Methods of set
 * 1) add(i)
 * 2) addAll(collection)
 * 3) remove(i)
 * 4) removeAll()
 * 5) clear()
 * 6) size()
 * 7) contains(i)
 * 8) containsAll(collection)
 * 9) isEmpty()
 * 10) toArray()
 * 11) hashCode()
 *
 * The Java platform contains three general-purpose Set implementations: 
 *  HashSet (arrange items randomly using hashCode )
 *  LinkedHashSet (arrange items in  added order )
 *  TreeSet (arrange item in sorted order)
 * 
 */

public class About_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> name = new HashSet<>();//add,remove - constant time complexity
		name.add("ashu");
		name.add("Rani");
		name.add("Aish");
		System.out.println(name);
		
		Set<String> name1 = new LinkedHashSet<>();//time complexity of remove will be like linked list 
		name1.add("ashu");
		name1.add("Rani");
		name1.add("Aish");
		System.out.println(name1.add("ashu"));//if element already not present in set it will return false else true
		System.out.println(name1);

		Set<String> name2 = new TreeSet<>();
		name2.add("ashu");
		name2.add("Rani");
		name2.add("Aish");
		System.out.println(name2);
		
		// Operations of Set
		Set<Integer> x=new HashSet<Integer>();
		x.add(5);
		x.add(6);
		x.add(1);
		Set<Integer> y=new HashSet<Integer>();
		y.add(50);
		y.add(6);
		y.add(45);
		System.out.println(y.contains(6));
		
		//Basic mathematical set operations like union, intersection, and subset.
		
		// Union - all x item and y item no repeat
		//x.addAll(y); //op: [1, 50, 5, 6, 45]
		
		//Intersection - all common item of x and y
		//x.retainAll(y); // op: [6]
		
		//Subset - check all the item of y is present in x
		//System.out.println(x.containsAll(y)); // if subset return true else false
		
		System.out.println(x); 
		
	}

}
