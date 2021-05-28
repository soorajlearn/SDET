package week10;

import org.junit.Test;

public class AbsoluteDiff {
/* Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
Example 3:
Input: nums = [1,2,3,2,2,3], k = 2
Output: true
Hint: Window Sliding
 * 
 * 
 * */
	
	
/*
 * declare start=0, end=1
 * loop thru input array
 * if(input[start]!=input[end] && ) end++
 * else check end-start<=k if yes, return true
 * else increment start 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
	
	@Test
	public void test1(){
		int[] input = {2,1,3,4,1};
		int k = 3;
		System.out.println(absoluteDiff(input, k));
	}
	
	
	public boolean absoluteDiff(int[] input, int k){
		
		int start=0, end =1;
		
		while(start<input.length && end<input.length) {
			
			if(input[start]!=input[end] && end<=input.length){
				end++;
			}else if(end==input.length-1){
				start++;
				end=start+1;
			}else if(input[start]==input[end]){
				if(end-start<=k){
					return true;

				}else{
					start++;
				}
			}
			
		}
		
		
		
		return false;
		
	}
}
