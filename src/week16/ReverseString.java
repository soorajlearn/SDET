package week16;

import org.junit.Test;

public class ReverseString {
	
	
	@Test
	public void test1(){
		String input = "hello";
		
		
		System.out.println(revString(input));
	}

	
	public String revStr(String input){
		char[] charArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=charArray.length-1; i>=0; i--){
			sb.append(charArray[i]);
		}
		
		return sb.toString();
	}
	String output = "";
	public String revString(String input){
		if(input.length()==0) {return input;}
		output = output +input.charAt(input.length()-1);
		revString(input.substring(0,input.length()-1));
		return output;
	}
	
	
}
