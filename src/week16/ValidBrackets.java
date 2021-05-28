package week16;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class ValidBrackets {
	
	@Test
	public void test1(){
		String input = "{(())}][]";
		System.out.println(validate(input));
	}
	
	@Test
	public void test2(){
		String input = "{(())}[]";
		System.out.println(isValid(input));
	}
	
	@Test
	public void test3(){
		String input = "(){}[[]]";
		System.out.println(isValid(input));
	}
	
	/*1. Create a map with opening as key and closing as value
	 *2. loop thru input string , if map contains the input as key , push into stack
	 *3. else if map contains the input as value && if stack is not empty pop from stack
	 *4. if the stack is empty return false
	 *5. At the end after looping, if the stack is empty return true */
	
	private boolean isValid(String input){
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');
		
		boolean result = false;
		
		Stack<Character> stack = new Stack<>();
		for (Character character : input.toCharArray()) {
			
			if(map.containsKey(character)){
				stack.push(character);
			}else if(map.containsValue(character)){
				if(!stack.isEmpty()){
				stack.pop();
				}else{
					return false;				
				}			
			}
			
		}
		
		if(stack.isEmpty()){
			result = true;
		}
		
		return result;
		
		
	}
	
	private boolean validate(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

}
