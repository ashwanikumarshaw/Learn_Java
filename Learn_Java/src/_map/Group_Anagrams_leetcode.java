package _map;

import java.util.*;

/*
 * Group Anagrams
 * Given an array of strings strs, group the anagrams together.
 *  You can return the answer in any order.

 * An Anagram is a word or phrase formed by rearranging the letters of 
 * a different word or phrase, typically using all the original letters 
 * exactly once.
 * 
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class Group_Anagrams_leetcode {
	public static List<List<String>> groupAnagrame(String[] strs){
		Map<String ,List<String>> map=new HashMap<>();
		
		for(String s:strs ) {
			char chararray[] = s.toCharArray();
			Arrays.sort(chararray);
			String sorted = new String(chararray);
			
			if(!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
			}
			map.get(sorted).add(s);
		}
		return new LinkedList<>(map.values());
		
	}

	public static void main(String[] args) {
		// test
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrame(strs));

	}

}
