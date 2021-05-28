package week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class TwoSumII {
	
	
	/*Two Sum II
	int[] nums = {1,4,5,7,8,9,11};
	int k = 12
	[[0,6][1,4][2,3]]
	int[] nums = {1,4,5,7,7,9,11};
	int k = 11
	[[1,3]]*/

	
	
	/*take start = 0 and end = nums.length-1
	sum the values in the start and end position and check whether it is matching k
	if it is matching k, all the start and end to the resultant List<List> and perform start++ and end--
	if the added value > k, do start++
	if the added value < k, do end--*/
	
	@Test
	public void test1(){
		int[] nums = {1,4,5,7,8,9,11};
		int k = 12;
		System.out.println(twoSum(nums, k));
	}
	@Test
	public void test2(){
		int[] nums = {1,4,5,7,7,9,11};
		int k = 11;
		System.out.println(twoSum(nums, k));
	}
	@Test
	public void test3(){
		int[] nums = {0,0,3,4};
		int k = 0;
		System.out.println(twoSum(nums, k));
	}
	
	
	public ArrayList<ArrayList<Integer>> twoSum(int[] nums, int k){
		
		int start =0, end = nums.length-1;
		ArrayList<ArrayList<Integer>> resultant = new ArrayList<>();
		while(start<end){
			int sum = nums[start]+nums[end];
			ArrayList<Integer> list = new ArrayList<>();
			if(sum==k) {list.add(start); list.add(end); resultant.add(list); start++; end--; continue;}
			if(sum>k) end--;
			if(sum<k) start++;	
		}
		
		return resultant;
		
	}
}
