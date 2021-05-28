package week17;

import java.util.Arrays;

import org.junit.Test;

public class ProductExceptSelf {

	@Test
	public void example1(){
		int[] input = {1,2,3,4};
		
		// left = {1,1,2,6}
		//right = {24,12,4,1}
		System.out.println(Arrays.toString(productExceptSelf(input)));
		System.out.println(Arrays.toString(bf(input)));
	}
	
	@Test
	public void example2(){
		int[] input = {0,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(input)));
		System.out.println(Arrays.toString(bf(input)));
	}
	
	@Test
	public void example3(){
		int[] input = {0,-2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(input)));
		System.out.println(Arrays.toString(bf(input)));
	}
	
	/*
	 * declare 2 arrays , 
	 * one to calculate products from left of input to form left product array 
	 * other to calculate products from right of input to form right product array
	 * multiply left * right to give output
	 * */
	
	
	public int[] productExceptSelf(int[] input){
		int[] output = new int[input.length];
		int n = input.length;
		 

        int[] left = new int[n];
        int[] right = new int[n];
 

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = input[i - 1] * left[i - 1];
        }

        right[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            right[j] = input[j + 1] * right[j + 1];
        }
 

        for (int i = 0; i < n; i++) {
            output[i] = left[i] * right[i];
        }
		
		return output;
	}
	
	
	public int[] bf(int[] input){
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			output[i]=1;
			for (int j = 0; j < input.length; j++) {
				if(i!=j){
					output[i] *=input[j];
				}
			}
		}
		return output;
	}
}
