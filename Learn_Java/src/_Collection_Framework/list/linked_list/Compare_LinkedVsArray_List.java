package _Collection_Framework.list.linked_list;

import java.util.*;

public class Compare_LinkedVsArray_List {

	public static void main(String[] args) {
		List <Integer> li=new LinkedList<>();
		List <Integer> al=new ArrayList<>();
		// insert at beginning
		getTimeDiff(al);//java.util.ArrayList ----->1258
		getTimeDiff(li);//java.util.LinkedList ----->26
		//LinkedList is faster 
	}

	 static void getTimeDiff(List<Integer> l) {
		// insert at beginning
		long start =System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			l.add(0, i);
		}
		long end =System.currentTimeMillis();
		System.out.println(l.getClass().getName()+
				" ----->"+(end-start));
	}

}
