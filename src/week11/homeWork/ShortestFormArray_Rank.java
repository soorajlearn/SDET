package week11.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ShortestFormArray_Rank {

	/*
	 * 1. Shortest form of array with rank
	 * 
	 * Sample input#1:
	 * 
	 * input : [10,2,1,4,10,2,5,13,5]
	 * 
	 * output : 1) you should get all the duplicates form of array first
	 * [10,2,1,4,10] [2,1,4,10,2] [5,13,5]
	 * 
	 * 2) then you should cut down to [5,13,5] (here all have same repetitions
	 * in the array thats why we are going with less count)
	 * 
	 * 3) final output should be: [5,13,5] with rank 2 (rank is repeation of
	 * digits in the shortest array)
	 * 
	 * Sample input #2:
	 * 
	 * input : [2,1,2,3,5,3,3]
	 * 
	 * here output should be [3,5,3,3] with rank 3
	 * 
	 * the most preference is rank than array size.
	 */
	
/*	Psuedo:
		
		1. Find the max occurance of the number using map
		2. If there is only one max occurance, 
		3. spot the first and last position of the number in input array and return it 
	    4. If there are multiple max occurance, consider each max occurance item  and do step 3 & return the difference & positions
	    5. Find minimum difference by considering every occurance & return the minimum difference containing number positions
	    6. loop thru the input array from first and last position and return the output 	*/	
	
	@Test
	public void test1(){
		int[] input = {10,2,1,4,10,2,5,13,5};
		System.out.println(shortestForm(input));
	}
	
	public ArrayList<Integer> shortestForm(int[] input){
		
		ArrayList<Integer> output = new ArrayList<>();
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < input.length; i++) {
			map.put(input[i], map.getOrDefault(input[i], 0)+1);
		}
		
		ArrayList<Integer> valuesList = new ArrayList<Integer>();
		valuesList.addAll(map.values());
		
		Collections.sort(valuesList);
		
		Integer max = valuesList.get(valuesList.size());
		
		System.out.println(max);
		
		return output;
		
	}

}
