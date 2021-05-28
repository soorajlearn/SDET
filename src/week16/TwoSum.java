package week16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TwoSum {
	
	@Test
	public void test1(){
		int [] input = {2,7,11,15,8,1};
		int target = 9;
		System.out.println(twoSum(input, target));
		System.out.println(twoSum1(input, target));
	}

	
	//BruteForce
	private ArrayList<ArrayList<Integer>> twoSum(int[] input, int target) {	
		ArrayList<ArrayList<Integer>>  output = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			for (int j = 1; j < input.length; j++) {
				if(input[i]+input[j]==target){
					ArrayList<Integer> list = new ArrayList<>();
					list.add(i);
					list.add(j);
					output.add(list);
				}
			}
		}
		return output;
	}
	
	//Map
	
	private ArrayList<ArrayList<Integer>> twoSum1(int[] input, int target){
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		ArrayList<ArrayList<Integer>>  output = new ArrayList<>();
		
		for(int i=0;i<input.length;i++) {
			if(map.containsKey(input[i])) {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(i);
				list.add(map.get(input[i]));
				output.add(list);
			}
			else {
				map.put(target-input[i], i);
			}
		}
		return output;
	}

}
