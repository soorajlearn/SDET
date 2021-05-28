package week8.homework;

import org.junit.Test;

public class Strobogrammatic {
	@Test
	public void test1(){
		String input = "160091";
		isStrobogrammatic(input);
	}
	
	public void isStrobogrammatic(String input){
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='6'){
				sb.append('9');
			}else if(input.charAt(i)=='9'){
				sb.append('6');
			}else{
				sb.append(input.charAt(i));
			}
		}
		
		System.out.println(sb.reverse().toString().equals(input));
		
	}

}
