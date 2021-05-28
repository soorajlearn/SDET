package week11.assessment;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class Calvin_Q2 {
	
	/*
	 * Iterate the Array and put it in map having key as the array[i] and values as count
	 * find the max 
	 * then add the max values to another list and return it
	 */
	
	@Test
	public void example1() {
		
		int[] arr = {4,5,2,1,5,4,2,1,0,1};
		List<Integer> out = mostFrequent(arr);
		System.out.println(out);

	}
	
	@Test
	public void example2() {
		
		int[] arr = {1,2,3,4,2,3,4};
		List<Integer> out = mostFrequent(arr);
		System.out.println(out);

	}
	
	private List<Integer> mostFrequent(int[] arr) {
		
		Map<Integer,Integer> mp  = new LinkedHashMap<Integer, Integer>();
		int max = Integer.MIN_VALUE;
		List<Integer> li = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
		}
		
		for (Entry<Integer, Integer> en : mp.entrySet()) {
			max = Math.max(max, en.getValue());
		}
		
		for (Entry<Integer, Integer> en : mp.entrySet()) {
			if(en.getValue()==max) {
				li.add(en.getKey());
			}
		}
		
		return li;
	}




}
