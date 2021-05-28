package week15;

import java.util.ArrayList;

import org.junit.Test;

public class sortedRotatedBinarySearch {

	/*
	 * You are given an integer array nums sorted in ascending order and an
	 * integer target.
	 * 
	 * Suppose that nums is rotated at some pivot unknown to you beforehand
	 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
	 * 
	 * If target is found in the array return its index, otherwise, return -1.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [4,5,6,7,0,1,2], target = 0 Output: 4 Example 2:
	 * 
	 * Input: nums = [4,5,6,7,0,1,2], target = 3 Output: -1
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [1], target = 0 Output: -1
	 */

	/*
	 * 1. Find the min value index 
	 * 2. define output array 
	 * 3. all min val index
	 * to length of input to output 
	 * 4. then add 0th index value to min val -1 to
	 * output
	 * 5. Perform Binary Search and spot the position 
	 * 6. absolute value
	 * of position index - min val index is the output
	 */
	@Test
	public void test1() {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		System.out.println(getIndex(nums, target));
	}
	
	@Test
	public void test2() {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 7;
		System.out.println(getIndex(nums, target));
	}

	public int getIndex(int[] nums, int target) {

		if (nums.length == 0)
			return -1;

		int index = 0;
		int min = nums[index];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] <= min) {
				min = nums[i];
				index = i;
			}
		}
	
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = index; i < nums.length; i++) {
			arr.add(nums[i]);
		}
		for (int i = 0; i < index; i++) {
			arr.add(nums[i]);
		}
		
		int low = 0, high = arr.size()-1;
		
		while(low<=high){
			int mid = (low+high)/2;
			
			if(arr.get(mid).equals(target)){
				return Math.abs((nums.length-1-index)-mid);
			}else if(arr.get(mid)<=target){
				low=mid+1;
			}else{
				high=mid-1;
			}
			
		}
		
		return -1;
	}

}
