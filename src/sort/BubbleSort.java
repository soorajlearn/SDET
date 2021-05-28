package sort;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {
	
	@Test
	public void test1(){
		int[] input = {11,4,17,18,2,22,1,8};
		System.out.println(Arrays.toString(bubbleSort(input)));
	}
	
	@Test
	public void test2(){
		int[] input = {2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(bubbleSort(input)));
	}
	
	@Test
	public void test3(){
		int[] input = {11,4,17,18,2,22,1,8};
		System.out.println(Arrays.toString(bubbleSort(input)));
	}
	
	
	public int[] bubbleSort(int[] input){
		
		for (int i = 0; i < input.length-1; i++) {
			for (int j = 0; j < input.length-1-i; j++) {				
				if(input[j]>input[j+1]){
					int temp = input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}				
			}			
		}
		return input;
		
	}

}
