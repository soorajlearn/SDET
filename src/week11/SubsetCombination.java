package week11;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SubsetCombination {
	
	/*Given an integer array nums, return all possible subsets . 
	The solution set must not contain duplicate subsets.  
	Example 1: Input: nums = [1,2,3] Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]] 
	Example 2: Input: nums = [0] Output: [[],[0]]*/
	
	
	//Approach
	/*1. 
	1. Iterate from index 0 to arr length
		for each iteration, call the recursive function 
	
	2.  Within the Recursive function, check if the list size equals iteration value, if so, add the elemets 
	to list.
	
	3. iterate within the recursive funciton, add elements to list,and call function recursively & backtrack
	4. return final output list
		

	for( 0- length-1) {
		recursion (1, list)
	}
	
	
	//recursion function (k value, list, List<List>)
	if(list.size==k)
		add to list<list and return
	
	for() {
		list.add(i);
		call recursion
		backtrack
	}*/
	
	@Test
	public void eg1() {
		int[] input= {1,2,3};
		System.out.println("Eg 1: "+combinations(input));
	}
	
	private List<List<Integer>> combinations(int[] input){
		List<List<Integer>> result = new ArrayList<>();
		
		for(int k=0;k<=input.length;k++) {
		combo(k, result, new ArrayList<Integer>(), 0, input);
		}
		return result;
	}
	
	
	private void combo(int k,List<List<Integer>> result, ArrayList<Integer> comb, int start, int[] input) {
		if(comb.size()==k) {
			List<Integer> lst= new ArrayList<>(comb);
			result.add(lst);
			return;
		}
		
		for(int i=start;i<input.length;i++) {
			comb.add(input[i]);
			combo(k, result, comb, i+1, input);
			comb.remove(comb.size()-1);
		}
	}

}
