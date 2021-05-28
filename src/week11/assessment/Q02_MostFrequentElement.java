package week11.assessment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

public class Q02_MostFrequentElement {

	/*
	 * 1. Iterate thru integer array and get the count of each integer in a map
	 * 2. Put all the values in a set and sort , and get the highest occurance
	 * 3. If map value matches the occurance store in the resultaant List
	 */
	@Test
	public void test1() {

		int[] input = { 4, 5, 2, 1, 5, 4, 2, 1, 0, 1 };
		System.out.println(mostRepeated(input));
	}
	
	@Test
	public void test2() {

		int[] input = { 2, 5, 2, 1, 5, 4, 2, 1, 0, 1 };
		System.out.println(mostRepeated(input));
	}

	public ArrayList<Integer> mostRepeated(int[] input) {

		ArrayList<Integer> output = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < input.length; i++) {
			map.put(input[i], map.getOrDefault(input[i], 0) + 1);
		}
		
		//Collection<Integer> values = map.values();
		
		ArrayList<Integer> valuesList = new ArrayList<Integer>();
		valuesList.addAll(map.values());
		
		Collections.sort(valuesList);
		

		for (java.util.Map.Entry<Integer, Integer> integer : map.entrySet()) {

			if (integer.getValue() == valuesList.get(valuesList.size() - 1)) {
				output.add(integer.getKey());
			}

			

		}
		return output;
	}
}
