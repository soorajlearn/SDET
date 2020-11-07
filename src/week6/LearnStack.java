package week6;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class LearnStack {
	
	@Test
	public void test1(){
		String input = "{(())}][]";
		System.out.println(isValid(input));
	}
	
	private boolean isValid(String input){
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');
		
		boolean result = false;
		
		Stack<Character> stack = new Stack<>();
		for (Character character : input.toCharArray()) {
			
			if(map.containsValue(character)){
				stack.push(character);
			}else if(map.containsKey(character)){
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

}
