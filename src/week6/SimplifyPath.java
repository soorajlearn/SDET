package week6;

import java.util.Stack;

import org.junit.Test;

public class SimplifyPath {
	@Test
	public void test1(){
		String input = "/a/.//b/../..//c/";
		System.out.println(simplifyPath(input));
		//simplifyPath(input);
	}
	
	private String simplifyPath(String input){
		
		
		
		String s1 =  input.replaceAll("/+", "/");
		
		String[] split = s1.split("/");
		
		
		Stack<String> stack  = new Stack<>();
		
		for (String string : split) {
			if(string.equals("..")){
				stack.pop();
			}else if(!string.equals(".")){
				stack.push(string);
			}
		}
		
		//System.out.println(stack.toString());
		
		StringBuilder sb = new StringBuilder();
		
		for (String s  : stack) {
			sb.append("/");
			sb.append(s);
		}
		
		return sb.toString();
	}

}
