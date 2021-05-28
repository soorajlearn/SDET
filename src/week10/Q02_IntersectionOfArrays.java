package week10;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Q02_IntersectionOfArrays {

	/*
	 * Given two arrays,find the intersection of 2 arrays.
	 * 
	 * Input: nums1 = [11,2,12,1], nums2 = [2,12] Output: [2,12]
	 * 
	 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [9,4]
	 */

	@Test
	public void test1(){
		int[] input1 ={11,2,12,1};
		int[] input2 = {2,12,1};
		
		System.out.println(intersection(input1, input2));
	}
	
	@Test
	public void test2(){
		int[] input1 ={4,9,5};
		int[] input2 = {9,4,9,8,4};
		
		System.out.println(intersection(input1, input2));
	}
	
	public ArrayList<Integer> intersection(int[]input1, int[] input2){
		
		ArrayList<Integer> output = new ArrayList<Integer>();
	
		
		int ptr1=0, ptr2=0;
		
		Arrays.sort(input1);
		Arrays.sort(input2);
			
		while(ptr1<input1.length && ptr2<input2.length) {
			
			if(input1[ptr1]==input2[ptr2]){
				output.add(input1[ptr1]);
				ptr1++;
				ptr2++;
			}else if(input1[ptr1]<input2[ptr2]){
				ptr1++;
			}else if(input1[ptr1]>input2[ptr2]){
				ptr2++;
			}
			
		}
		
		return output;
	}
}
