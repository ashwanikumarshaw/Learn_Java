package _Collection_Framework.list.stack;

import java.util.Scanner;
import java.util.Stack;

/*
 *  balanced parentheses
 *  
 *  Given an expression string exp, 
 *  write a program to examine whether the pairs and 
 *  the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.

Example:

Input: exp = “[()]{}{[()()]()}”
Output: Balanced

Input: exp = “[(])”
Output: Not Balanced
 
 */
public class Balanced_parentheses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		while(t--!=0) {
			String s=sc.next();
			
			Stack<Character> stack =new Stack<>();
			boolean isBalance=true;
			for(int i =0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch=='{' ||ch=='[' ||ch=='(') {
					stack.push(ch);
					continue;
					}
				if(stack.isEmpty()) {
					isBalance=false;
					break;
				}
				if(ch=='}') {
					if(stack.peek()=='{') {
						stack.pop();
					}else {
						isBalance=false;
						break;
					}
				}
				if(ch==']' ) {
					if(stack.peek()=='[') {
						stack.pop();
					}else {
						isBalance=false;
						break;
					}
				}
				if(ch==')') {
					if(stack.peek()=='(') {
						stack.pop();
					}else {
						isBalance=false;
						break;
					}
				}
			}
			if(!stack.isEmpty()) {
				isBalance=false;
			}
			if(isBalance)
				System.out.println("Blanced");
			else
				System.out.println("Not balanced");
			sc.close();
		}

	}

}
