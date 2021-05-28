package week15;

import org.junit.Test;

public class findPeak {
	
	
	/*A peak element is an element that is strictly greater than its neighbors.

	Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

	You may imagine that nums[-1] = nums[n] = -∞.

	Example 1:

	Input: nums = [1,2,3,1]
	Output: 2
	Explanation: 3 is a peak element and your function should return the index number 2.
	Example 2:

	Input: nums = [1,2,1,3,5,6,4]
	Output: 5
	Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
*/
	
	//@Test
	public void test1(){
		int[] numbers = {1,2,3,1};
		System.out.println(peakElement1(numbers));
	}
	
	//@Test
	public void test2(){
		int[] numbers = {1,2,1,3,5,6,4};
		System.out.println(peakElement1(numbers));
	}
	
	@Test
	public void test3(){
		int[] numbers = {1,2,8,4,6,7,8,9,10};
		System.out.println(peakElement1(numbers));
	}
	
	@Test
	public void test4(){
		int[] numbers = {3,0,1,2};
		System.out.println(peakElement1(numbers));
	}
	
	/*
	 * 1. Declare low as 0 and high as input.length-1
	 * 2. iterate till low<=high
	 * 3. take mid = low+high/2
	 * 4. if mid element is a peak element , return mid
	 * 5. if left side of mid is higher than mid, update high = mid -1 
	 * 6. if right side of mid is higher than mid, update low = mid +1 
	 * */
	
	
	public int peakElement(int[] numbers,int low, int high){
		
		
		//int low = 0, high = numbers.length;
		
		while (low<=high){
			int mid = (low+high)/2;
			if(mid==0||mid==numbers.length-1||(numbers[mid]>numbers[mid-1])&&(numbers[mid]>numbers[mid+1])){
				return mid;
			}else if(numbers[mid-1]>numbers[mid]){
				//high = mid-1;
				peakElement(numbers, low, mid-1);
			}else if( numbers[mid+1]>numbers[mid]){
				//low=mid+1;
				peakElement(numbers, mid+1, high);
			}
		}
		return -1;
		
	}
	
	public int peakElement1(int[] numbers){
		return peakElement(numbers, 0, numbers.length-1);
	}
}
