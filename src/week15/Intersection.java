package week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Intersection {
	
	@Test
	public void test1(){
		Integer[] nums1 = {2,3,4,4,1};
		Integer[] nums2 = {4,4,1};
		System.out.println(intersection(nums1, nums2));
		
	}
	
	
	/*
	 * 1. Loop thru first array
	 * 2. if the second array contains i, add to resultant set*/
	
	public Set<Integer> intersection(Integer[] nums1, Integer[] nums2){
		
		List<Integer> list = new ArrayList<>(Arrays.asList(nums1));
		Set<Integer> output = new HashSet<>();
		
		for (int i = 0; i < nums2.length; i++) {
			if(list.contains(nums2[i])){
				output.add(nums2[i]);
			}
		}
		return output;
		
	}

}
