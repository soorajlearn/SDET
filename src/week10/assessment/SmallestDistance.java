package week10.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class SmallestDistance {
	
	
	/*Given an input array and two unique numbers, find the smallest distance between those 2 numbers
	   Example:a
	   
	   Input1: [5,6,8,9,1,4,1] Input2: 8,1 Output: 2
	      a) If there are no occurances of the unique numbers, then throw exception
	      b) If there are multiple matches, the least distance should be considere*/
	
	
	/*convert input 2 into arraylist
	loop thru first array and check every number is available in input 2 array list or not,
	if available  assign start = current i and 
	continue looping and do the step 2,3, 
	but this time if available check if current i value = start value , if yes override start with i
	else assign end = i, break
	if end  is not assigned till end of the array, throw exception
	return end-start*/
	
	@Test
	public void test1() throws Exception{
		int[] input1 = {5,6,8,9,4,1,1,1,1,8};   
		//2,7   4,6   -2,-4,3,1,2,-3,-4,-1
		Integer[] input2 = {5,1};
		System.out.println(smallestDistance1(input1, input2));
		
	}
	
	
	public int smallestDistance(int[] input1, Integer[] input2) throws Exception{
		
		ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(input2));
		int start=0, end=0;
		for (int i = 0; i < input1.length; i++) {
			
			 if(inputList.contains(input1[i])){
				if(input1[i]!=input1[start] && start ==0){
					start = i;
				}else if(input1[i]==input1[start]){
					start = i;
				}else{
					end=i;
					break;
				}
			}
			
		}
		
		if(end-start<=0){
			throw new Exception("Either one of element is not available");
		}
		else
		return end-start;
		
		
		
	}
	
	/* 1. Find position of first integer and save it in an array list, if array list is empty, throw err
	 * 2. Find position of second integer and save it in an array list, if array list is empty, throw err
	 * 3. find the abs diff between two array list and sort it 
	 * 4. return the resultant.get(0) 
	 * */
	
	public int smallestDistance1(int[] input1, Integer[] input2) throws Exception{
		
		ArrayList<Integer> pos1 = new ArrayList<>();
		ArrayList<Integer> pos2 = new ArrayList<>();
		ArrayList<Integer> resultant = new ArrayList<>();
		
		for (int i = 0; i < input1.length; i++) {
			if(input1[i]==input2[0]){
				pos1.add(i);
			}		
		}
		
		if(pos1.isEmpty()){
			throw new Exception("Either one of element is not available");
		}
		
		for (int i = 0; i < input1.length; i++) {
			if(input1[i]==input2[1]){
				pos2.add(i);
			}		
		}
		
		if(pos2.isEmpty()){
			throw new Exception("Either one of element is not available");
		}
		
		for (int i = 0; i < pos1.size(); i++) {
			for (int j = 0; j < pos2.size(); j++) {
				resultant.add(Math.abs(pos1.get(i)-pos2.get(j)));
			}	
		}
		
		Collections.sort(resultant);
		
		return resultant.get(0);
		
		
		
	}

}
