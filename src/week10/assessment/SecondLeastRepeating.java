package week10.assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;

public class SecondLeastRepeating {
	
	/*Find the second least character in a given string
	  Example:
	  Input: "tesla-service" Output: s 
	     a) If there are more than one match, return the last match "aabbccc" -> 'b'
	     b) If there are no second match, return ''*/
	
	
	/*Pseudo Code:
		
		1. create a map and add occurances of each character of input in that 
		2. sort the occurances
		3. if occurance.size==1, no repeating character
		4. else get occurance.size()-2 for second least repeating
		*/
	
	
	
	
	@Test
	public void test1() {
		String input = "tesla-service";
		secondLeastRepeating(input);
	}

	@Test
	public void test2() {
		String input = "aabbccc";
		secondLeastRepeating(input);
	}

	@Test
	public void test3() {
		String input = "ppp";
		secondLeastRepeating(input);
	}
	
	@Test
	public void test4() {
		String input = "abcde";
		secondLeastRepeating(input);
	}
	
	

	private void secondLeastRepeating(String input) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		ArrayList<Integer> occ = new ArrayList<>();
		ArrayList<Character> secondLeastRepeating = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
		}
		System.out.println(map);

		Set<Entry<Character, Integer>> entrySet = map.entrySet();

		for (Entry<Character, Integer> entry : entrySet) {
			if (!occ.contains(entry.getValue())) {
				occ.add(entry.getValue());
			}
		}
		Collections.sort(occ);

		if (occ.size() == 1) {
			System.out.println("No second least");
		} else {
			int secondLeast = occ.get(occ.size()-2);
			for (Entry<Character, Integer> entry : entrySet) {

				if (entry.getValue() == secondLeast) {
					secondLeastRepeating.add(entry.getKey());
					break;
				}

			}
		}
		System.out.println(secondLeastRepeating);

	}




}
