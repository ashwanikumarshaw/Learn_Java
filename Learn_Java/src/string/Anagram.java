package string;

import java.util.Arrays;
/*
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 *  typically using all the original letters exactly once
 *  
 */
public class Anagram {

	public static void main(String[] args) {
		String s1="ashu";
		String s2="hsaw";
		//O(nlogn)
		String[] ss1=s1.split("");
		String[] ss2=s2.split("");
		Arrays.sort(ss1);
		Arrays.sort(ss2);
		boolean c=false;
		if(s1.length()!=s2.length()) {
			System.out.println("Not Anagram");
		}
		else if(s1.length()==s2.length())
		for(int i=0;i<ss1.length;i++) {
			System.out.println(ss1[i]+ " "+ss2[i]);
			if(!ss1[i].equals(ss2[i])) {
				System.out.println("Not Anagram");
				c=false;
				break;
				}
			else
				c=true;
			}
		if(c)
			System.out.println("Anagram");
		
	
	}

}
