package week10;

import java.util.ArrayList;

import org.junit.Test;

public class RevisedArrayLength {
	
	/* 1. declare start=0 and end=input.length-1 and resultLength = 0
	 * 2. while start<end 
	 *       if(input[start]!=input1) resultLength++
	 *       if(input[end]!=input1) resultLength++
	 *       start++
	 *       end--
	 * 
	 * 
	 * */
	
	@Test
	public void test1(){
		int[] input1 = {3,0,1,2,3,0,4,2};
		int input2 = 3;
		
		ArrayList<Integer> revisedArray = revisedArrayLength(input1, input2);
		
		System.out.println(revisedArray);
	}

	@Test
	public void test2(){
		int[] input1 = {3,0,1,2,2,3,0,4,2};
		int input2 = 3;
		
		ArrayList<Integer> revisedArray = revisedArrayLength(input1, input2);
		
		System.out.println(revisedArray);
		
	}
	
	@Test
	public void test3(){
		int[] input1 = {3,0,1,2,2,3,0,4,2};
		int input2 = 9;
		
		ArrayList<Integer> revisedArray = revisedArrayLength(input1, input2);
		
		System.out.println(revisedArray);
		
	}
	
	public ArrayList<Integer> revisedArrayLength(int[] input1, int input2){
		
		int start=0, end = input1.length-1;
		ArrayList<Integer> resultList = new ArrayList<>();
		
		
		
		while(start<end){
			if(input1[start]!=input2){
				resultList.add(input1[start]);
			}
			if(input1[end]!=input2){
				resultList.add(input1[end]);
			}
			start++;
			end--;
		}
		
		if(start==end && input1[start]!=input2){
			resultList.add(input1[start]);
		}
		
		
		return resultList;
	}

}
