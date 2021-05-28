package week15;

import org.junit.Test;

public class findElementinRotated {
	
	
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
		
		int low=0, high = nums.length;
		while(low<=high){
			int mid = (low+high)/2;
			if(nums[mid]==target){
				return mid;
			}else if(nums[low]<=nums[mid]){
				if(target>=nums[low] && target< nums[mid]){
					high = mid-1;
				}else{
					low = mid+1;
				}
			}
		}
		return -1;
	
		
		
	}

}
