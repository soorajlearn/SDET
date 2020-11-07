package week3.weekend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class Q02_SecondLeastRepeatingChar {
	@Test
	public void test1() {
		String input = "paypal";
		secondLeastRepeating(input);
	}

	@Test
	public void test2() {
		String input = "malayalam";
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
			int secondLeast = occ.get(1);
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
