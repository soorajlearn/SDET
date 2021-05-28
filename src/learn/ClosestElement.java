package learn;

import java.util.Arrays;

import org.junit.Test;

public class ClosestElement {
	
	@Test
	public void test1(){
		int[] input = {2,1,5,8,3};
		System.out.println(Arrays.toString(closestElement(input)));
	}
	
	@Test
	public void test2(){
		int[] input = {3,1,5,8,2};
		System.out.println(Arrays.toString(closestElement(input)));
	}
	
	@Test
	public void test3(){
		int[] input = {3,1,5,8,3};
		System.out.println(Arrays.toString(closestElement(input)));
	}
	
	
	/*
	 * 1. for element in index 0,1 set the output as -1 and first element value 
	 * 2. loop thru rest of array
	 * 3. For every element loop from index 0 till index-1 and find the absolute difference 
	 *    and assign the least difference element to the output */
	
	
	//O[N]^2
	public int[] closestElement(int[] input){
		
		int[] output = new int[input.length];
		output[0] = -1;
		output[1] = input[0];
		for (int i = 2; i < input.length; i++) {
			int minDiff = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {
				int val = Math.abs(input[i]-input[j]);
				if(val<minDiff && val != 0 ){
					minDiff=val;
					output[i]=input[j];
				}
			}		
		}
		
		return output;
	}
	
	
	public void closestElement1(int[] input){
	}
	

}
