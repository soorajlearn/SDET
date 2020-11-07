package week2.weekend.homework;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class Q03_StringAdjacent {
	/*
	 * 3) Given a string, check if the letters can be rearranged so that two
	 * characters that are adjacent to each other are not the same.
	 * 
	 * Input: "aab" Output: "aba" total - 3 max - 2
	 * 
	 * Input: "aaab" Output: "" total -4 max - 3
	 * 3 1 
	 */
	/*aaaaaabbbcccc
	abcabcabcabcaa
	a=5, b=4, c=3 total - 12, max - 5  
	abcabcabcaba
	5,4,4*/
	
	
	@Test
	public void test1(){
		String input = "aabccc";
		occurancesOfCharacters(input);
		
	}
	
	@Test
	public void test2(){
		String input = "aaaaaabbbcccc";
		occurancesOfCharacters(input);
	}
	
	private void occurancesOfCharacters(String input){
		String output="pass";
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		char[] charArray = input.toCharArray();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (char c : charArray) {
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		
		
		
		Collection<Integer> values = map.values();
		arr.addAll(values);
		Collections.sort(arr);
		Collections.reverse(arr);
		
		for (int i = 0; i < arr.size()-1; i++) {
			if((arr.get(i)-arr.get(i+1))==1){
				continue;
			}else{
				output="fail";
			}
		}
		
		
		
		
		System.out.println(map);
		
		
		System.out.println(arr);
		
		System.out.println(output);
		
		
		
		
	}

}
