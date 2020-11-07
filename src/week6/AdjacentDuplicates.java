package week6;

import java.util.Stack;

import org.junit.Test;

public class AdjacentDuplicates {
	
	@Test
	public void test1(){
		String input ="abbaca";
		String output = adjacentDups(input);
		System.out.println(output);
	}
	
	@Test
	public void test2(){
		String input ="abcaaabbcb";
		String output = adjacentDups(input);
		System.out.println(output);
	}
	
	private String adjacentDups(String input){
		
		Stack<Character> stack = new Stack<>();
		for (Character c : input.toCharArray()) {
			
			if(!stack.isEmpty() && stack.peek().equals(c)){
				stack.pop();
			}else{
				stack.push(c);
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (Character character : stack) {
			sb.append(character);
		}
		
		return sb.toString();
		
		
	}

}
