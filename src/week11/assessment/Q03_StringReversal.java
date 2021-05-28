package week11.assessment;

import org.junit.Test;

public class Q03_StringReversal {
	
	/*
	 * 1. split the input into string array using space
	 * 2. Iterate from last 
	 * 3. If i%2!=0, reverse the string  and add to output 
	 * 4. else add to output string without reversal
	 * */

	@Test
	public void test1(){
		String input = "There is no test";
		System.out.println(stringReversal2(input));
	}
	
	@Test
	public void test2(){
		String input = "There is no test but there is";
		System.out.println(stringReversal2(input));
	}
	
	public String stringReversal(String input){
		String output = "";
		String[] split = input.split(" ");
		for (int i = split.length-1; i >=0; i--) {
			
			if(i%2!=0){
				StringBuffer b = new StringBuffer(split[i]);
				output+= b.reverse().toString()+" ";			
			}else{
				output+= split[i]+" ";
			}
			
		}
		
		return output.trim();
	}
	
	
	
		/*
		 * Method 2: 
		 * 1. reverse the entire string
		 * 2. split the reversed string into string array using space
		 * 2. Iterate from first 
		 * 3. If i%2!=0, reverse the string  and add to output 
		 * 4. else add to output string without reversal
		 * */
	
	public String stringReversal2(String input){
		StringBuffer c = new StringBuffer(input);
		
		String string = c.reverse().toString();
		String output = "";
		String[] split = string.split(" ");
		for (int i = 0; i<split.length; i++) {
			
			if(i%2!=0){
				StringBuffer b = new StringBuffer(split[i]);
				output+= b.reverse().toString()+" ";			
			}else{
				output+= split[i]+" ";
			}
			
		}
		
		return output.trim();
	}
}
