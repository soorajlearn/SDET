package learn;

import org.junit.Test;

public class MaxSubArraySum {
	
	
	/*
	 * 	Find maximum subarray sum
		Input: [ 1, -5, 2, -3, 7, 1]
		Output: 8*/
	
	@Test
	public void test1(){
		int[] input = {1,-5,2,-3,7,1};
		System.out.println(maxSubArraySum(input));
	}
	
	
	@Test
	public void test2(){
		int[] input = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArraySum(input));
	}
	
	
	
	
	public int maxSubArraySum(int[] input){
		int max=0;
		int output=0;
		
		for (int i = 0; i < input.length; i++) {
			max+= input[i];
			
			output=Math.max(max, output);
			
			if(max<0) max=0;
		}
		
		return output;
		
	}

}
