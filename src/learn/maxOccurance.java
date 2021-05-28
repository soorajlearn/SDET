package learn;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class maxOccurance {
	
	@Test
	public void test1(){	
		String input = "Soorrrrrrrraaaaaaj";
		System.out.println(getMax(input));	
	}
	
	
	public char getMax(String input){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = Integer.MIN_VALUE;
		char out = 0;
		for (int i = 0; i < input.length(); i++) {
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0)+1);	
			if(map.get(input.charAt(i))>max){
				max = map.get(input.charAt(i));
				out = input.charAt(i);
			}
		}
		return out;
		
	}

}
