package week10;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Q01_MovePositiveNumbers {

	/*
	 * 1) Write a program to move all the positive numbers to end.
	 * 
	 * Input: [4, -1, 9, 0, 2, -4, 5] Output: [-1, 0, -4, 4, 9, 2, 5]
	 */
	
	
	@Test
	public void test1(){
		int[] input = {4, -1, 9, 0, 2, -4, 5};
		System.out.println(movePositiveIntegers(input));
		System.out.println(Arrays.toString(movePositiveIntegers1(input)));
	}
	
	
	public ArrayList<Integer> movePositiveIntegers(int[] input){
		
		ArrayList<Integer> s = new ArrayList<>();
		int start=0, end=input.length-1;
		
		while(start<end){
			
			if(input[start]<=0){
				s.add(0,input[start]);
			}
			
			if(input[end]<=0){
				s.add(0,input[end]);
			}
			if(input[end]>0){
				s.add(input[end]);
			}	
			if(input[start]>0){
				s.add(input[start]);
			}
				
			start++;
			end--;
		}
		if(start==end){
			if(input[start]<=0){
				s.add(0,input[start]);
			}else{
				s.add(input[start]);
			}
		}

		return s;
		
	}

	public int[] movePositiveIntegers1(int[] input){
		
		int start=0, end =0;
		
		for (int i = 0; i < input.length; i++) {
			if(input[end]<=0){
				int temp = input[start];
				input[start] = input[end];
				input[end]=temp;
				start++;
				end++;
			}else{
				end++;
			}
		}
		
		return input;
		
	}


}
