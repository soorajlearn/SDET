package learn;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GetAllPermutations {

	@Test
	public void test1(){
		String input = "abc";
		permute(input, 0, input.length()-1);
		System.out.println(output);
	}
	
	ArrayList<String> output = new ArrayList<>();
	
	public void permute(String input, int start, int end){
		
		if(start==end){
			//System.out.println(input);
			output.add(input);
		}else{
			for (int i = start; i <= end; i++) {
				input = swap(input,start,i);
				permute(input, start+1, end);
				input = swap(input,start,i);
				
			}
			
		}
		
	}
	
	public String swap(String input, int start, int end){
		char[] charArray = input.toCharArray();
		char temp = charArray[start];
		charArray[start] = charArray[end];
		charArray[end] = temp;
		return String.valueOf(charArray);
	}
}
