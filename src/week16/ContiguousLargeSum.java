package week16;

import org.junit.Test;

public class ContiguousLargeSum {
	
	/*Given an integer array nums, 
	 * find the contiguous subarray (containing at least one number) 
	 * which has the largest sum and return its sum.*/
	
	@Test
	public void test1(){
		int[] input = {-2,1,-3,4,-1,6,2,1,-5,4};
		System.out.println(contiguousLargeBrute(input));
	}
	
	
	@Test
	public void test2(){
		int[] input = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(contiguousLargeBrute(input));
	}
	
	@Test
	public void test3(){
		int[] input = {-2,-1,-3,-4};
		System.out.println(contiguousLargeBrute(input));
	}
	
	
	public int contiguousLargeBrute(int[] input){
		
		int maxSum= Integer.MIN_VALUE;
		
		for (int i = 0; i < input.length; i++) {
			int currentSum = 0;
			for (int j = i; j < input.length; j++) {
				currentSum += input[j];
				maxSum = Math.max(maxSum, currentSum);
			}		
		}	
		return maxSum;
	}
	
	/*
	 * 1. Declare 2 variables pointing input[0], currentSum & MaxSum
	 * 2. Iterate from input[1] to input.length
	 * 3. if currentSum+input[i]<input[i], currentSum = input[i],
	 *   else currentSum += input[i];
	 * 4. if currentsum>maxsum, assign currentSum to maxSum
	 * 5. return maxSum
	 * */
	
	//Window Sliding 
	public int contiguousLargeSum(int[] input){
	
		int currentSum= input[0];
		int maxSum= input[0];
		
		for (int i = 0; i < input.length; i++) {
			if(currentSum+input[i]<input[i]) currentSum = input[i];
			else currentSum += input[i];
			
			if(currentSum>maxSum) {
				maxSum=currentSum;
			}
		
		}
		
		return maxSum;
	}
	
	//Divide&Conquer
	public int contiguousLargeSum2(int[] input){
		
		return 0;
	}

}
