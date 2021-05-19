package _map;

import java.util.*;
import java.util.Map.Entry;


/*
 * Map Interface 
 * 
 * Elements of map are stored in key / value pairs 
 * Keys are unique values associated with individual Values
 * 
 * A map can't contain duplicate Keys And each key is 
 * associated with single values .
 * 
 * As map is an interface we can't create objects of it;
 * So to use its functionalities  we use classes :
 * 
 * >> HashMap //imp
 * >> EnumMap
 * >> LinkedHashMap
 * >> WeakHashMap
 * >> TreeMap // imp
 *  
 */
public class About_map {

	public static void main(String[] args) {
		// Methods of Map
		 Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");//put ( key , value )
		  map.putAll(map);//It is used to insert the specified map in the map.
		  map.putIfAbsent(2, "Ashwani");
		  map.get(100);// get ( key )
		  map.getOrDefault(100, "Not found use : Ashu");//getOrDefault ( key , default value )
		  map.containsKey(100);
		  map.containsValue("Ashu");
		  map.replace(100, "Aman");//replace(key, value)
		  map.replace(2,"Ashwani","Ashu");//replace(key, oldValue, newValue)
		  // map.remove(2);//remove(key)
		  System.out.println(map);
		  System.out.println(map.keySet());
		  System.out.println(map.values());
		  System.out.println(map.entrySet()); 
		  
		  for(Entry<Integer, String> entry:map.entrySet()) {
			  entry.setValue(entry.getValue() +" kumar ");
		  }
		  System.out.println(map);
	}

}
