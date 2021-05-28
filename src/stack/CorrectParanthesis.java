package stack;

import java.util.Stack;

import org.junit.Test;

public class CorrectParanthesis {
	
	
/*Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.
Formally, a parentheses string is valid if and only if:
It is the empty string, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.
SAMPLE INPUT 
()))((
SAMPLE OUTPUT 
4
Explanation
The given string can be balanced to "((()))(())", requiring 4 more paranthesis minimum.*/
	
	
	@Test
	public void test1() throws Exception{
		String str = "{{}}{{";
		System.out.println(correctParanthesis(str));
	}
	
	

	@Test
	public void test2() throws Exception{
		String str = "{}}}{{";
		System.out.println(correctParanthesis(str));
	}
	
	@Test
	public void test3() throws Exception{
		String str = "{{}}{}{{}}";
		System.out.println(correctParanthesis(str));
	}
	@Test
	public void test4() throws Exception{
		String str = "{{}{}";
		System.out.println(correctParanthesis(str));
	}
	
	/* Convert string into character array
	 * Loop thru character array 
	 *   if current character is opening bracket push into stack 
	 *   else if current character is closing bracket if the stack is not empty, pop from stack 
	 *   else increase the counter 
	 *   
	 *   return size of stack +counter
	 * 
	 * */
	
	private int correctParanthesis(String str) throws Exception {
		Stack<Character> s = new Stack<>();
		int count=0;
		for (char ch : str.toCharArray()) {
			if(ch=='{') s.push(ch);
			else if(!s.isEmpty() && ch=='}') s.pop();
			else count++;
		}
		return count+s.size();
		
	}
	

}
