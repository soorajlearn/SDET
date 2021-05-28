package learn;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class IntersectionofKArrays {

	/*@Test
	public void test1() {
		ArrayList<ArrayList<Integer>> input = new ArrayList<>();
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 5, 3));
		ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(6, 8, 9, 2));
		input.add(arr1);
		input.add(arr2);
		input.add(arr3);
		System.out.println(getIntersection(input));

	}*/

	/*
	 * public ArrayList<Integer> getIntersection(ArrayList<ArrayList<Integer>>
	 * input){
	 * 
	 * for (int i = 1; i < input.size(); i++) {
	 * input.get(0).retainAll(input.get(i)); }
	 * 
	 * return input.get(0);
	 * 
	 * }
	 */
	
	
	public void test1() {
		ArrayList<Integer[]> input = new ArrayList<>();
		input.add(new Integer[] {1,2,3});
		input.add(new Integer[] {2,3,4});
		input.add(new Integer[] {4,5,6,3});
		//System.out.println(getIntersection(input));

	}

	/*public ArrayList<Integer> getIntersection(ArrayList<Integer[]> input) {
		
		

		

	}*/

	public Integer[] inter(Integer[] arr1, Integer[] arr2) {
		
		ArrayList<Integer> out = new ArrayList<>();
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
		
		for (Integer integer : list1) {
			
			if(list2.contains(integer)){
				out.add(integer);
			}
			
		}
		
		return (Integer[]) out.toArray();
		
		
		

	}

}
