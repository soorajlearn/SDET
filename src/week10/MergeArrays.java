package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

public class MergeArrays {
	
	/* 1. Find the number of trailing zeros in nums1 and confirm whether it is matching count of nums 2 
	 * 2. If yes, continue step 3 , else throw exception
	 * 3. declare an resultant array and loop thru first array till nums1.length - number of trailing zeros and add to it
	 * 4. loop thru second array and add to resultant array
	 * 5. sort the resultant  
	 * */
	
	@Test
	public void test1(){
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,3,6};
		System.out.println(sortedMerge(nums1, nums2));
	}
	
	public ArrayList<Integer> sortedMerge(int[] nums1, int[] nums2){
		
		ArrayList<Integer>  resultant = new ArrayList<Integer>();
		int count =0;
		for(int i = nums1.length-1; i>=0; i--){
			if(nums1[i]==0){
				count+=1;
			}else{
				break;
			}
		}
		
		if(count!=nums2.length){
			System.out.println("Invalid input");
		}else{
			for (int i = 0; i < nums1.length-nums2.length; i++) {
				resultant.add(nums1[i]);
			}
			for (int i = 0; i < nums2.length; i++) {
				resultant.add(nums2[i]);
			}
		}
		Collections.sort(resultant);
		
		return resultant;
		
	}

}
