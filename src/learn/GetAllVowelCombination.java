package learn;

import java.util.ArrayList;

import org.junit.Test;

public class GetAllVowelCombination {
	
	@Test
	public void test1(){
		int k=2;
		System.out.println(getAllVowelCombinations(k));
	}
	
	public ArrayList<String> getAllVowelCombinations(int k){
		
		ArrayList<String> output = new ArrayList<>();
		
		String vowels ="aeiou";
		
		recurse(vowels, k, "",output, 0);
		
		return output;
	}
	
	public void recurse(String vowels, int k,String temp,ArrayList<String> output, int start){
		if(k==0){
			output.add(temp);
			return;
		}
		
		
		
		for(int i=start; i<vowels.length(); i++){
			recurse(vowels, k-1, temp+vowels.charAt(i),output, i);
		}
		
		
	}

}
