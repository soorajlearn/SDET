package week10;

import java.util.Arrays;

import org.junit.Test;

public class Q04_SubArraySum {

	/*
	 * Write a program to fetch the sub array of length k from a given array and
	 * the sub array must have maximum sum of all combinations (without sorting
	 * the array)
	 * 
	 * Input: [4,2,11,1,23,2,3,15,14] , k = 3 Output: [11,1,23]
	 * 
	 * Input: [4,2,1,-7,23,2,-3,15,14], k = 4 Output: [2,-3,15,14]
	 * 
	 * Algorithm: Sliding Window
	 */
	
	@Test
	public void test1(){
		
		int[] input = {4,2,11,1,40,2,3,15,25};
		int k = 3;
		System.out.println(Arrays.toString(subArraySum(input, k)));
		
	}
	
	@Test
	public void test2(){
		
		int[] input = {4,2,1,-7,23,2,-3,15,14};
		int k = 4;
		System.out.println(Arrays.toString(subArraySum(input, k)));
		
	}
	
	
	public int[] subArraySum(int[] input, int k){
		
		int[] output = new int[k];
		
		int start=0, end=0, windowSum=0, maxSum = 0, start1=0, end1=0;
		
		for(int i=0; i<input.length; i++){
			System.out.println("Hello");
			if(i<k){
				end++;
				windowSum +=input[i];
				maxSum=windowSum;
			}else{
				windowSum = windowSum - input[start] + input[end];
				maxSum = Math.max(maxSum, windowSum);
				start++;
				end++;
			}
			if(maxSum==windowSum){
				start1=start;
				end1=end;
			}
			
			
		}
		
		output = Arrays.copyOfRange(input, start1, end1);
		
		return output;
		
		
	}

}
