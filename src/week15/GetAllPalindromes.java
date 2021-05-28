package week15;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GetAllPalindromes {
	
	@Test
	public void test1(){
		String input = "abaa";
		System.out.println(getPossiblePalindromes(input));
		
	}
	@Test
	public void test2(){
		String input = "turf";
		System.out.println(getPossiblePalindromes(input));
		
	}
	
	
	public ArrayList<String> getPossiblePalindromes(String input){
		
		ArrayList<String> output = new ArrayList<>();
		for(int i=0;i<input.length();i++) {
            expandcenter(input,i,i,output);
            expandcenter(input,i,i+1,output);
        }
        
        return output;
		
		
	}
	
	
	 private void expandcenter(String input,int start,int end, ArrayList<String> list) {
	        while(start>=0 && end<input.length()&& input.charAt(start)==input.charAt(end)) {
	            list.add(input.substring(start, end+1));
	            start--;
	            end++;
	        }
	    }

}
