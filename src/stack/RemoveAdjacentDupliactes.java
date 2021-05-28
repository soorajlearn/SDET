package stack;

import java.util.Stack;

import org.junit.Test;

public class RemoveAdjacentDupliactes {
	
	/*Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
	We repeatedly make duplicate removals on S until we no longer can.
	Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
	Example 1:
	Input: "abbaca"
	Output: "ca"
	Explanation: 
	For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
	Note: S consists only of English lowercase letters.*/
	
	@Test
	public void test1(){
		String str = "abbaca";
		System.out.println(removeAdjacentDuplicates(str));
	}
	
	@Test
	public void test2(){
		String str = "abbabccb";
		System.out.println(removeAdjacentDuplicates(str));
	}
	
	@Test
	public void test3(){
		String str = "abbbcd";
		System.out.println(removeAdjacentDuplicates(str));
	}
	
	/* Convert input string into character array
	 * loop thru character array
	 *   if peek element of stack is not equal to  character push every character into stack
	 *   else pop from stack
	 * return stack by converting it to string
	 *   */
	
	//O[N]
	public String removeAdjacentDuplicates(String str){
		Stack<Character> s = new Stack<>();
		
		for (Character character : str.toCharArray()) {
			if(!s.isEmpty() && s.peek()!=character) s.push(character);
			else if(s.isEmpty()) s.push(character);
			else s.pop();
		}
	
		return s.toString();
	}

}
