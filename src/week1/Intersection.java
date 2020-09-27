package week1;
import java.util.ArrayList;

import org.junit.Test;

public class Intersection {

	@Test
	public void example1(){
		int[] arr2 = {1,2,4,5,7};
		int[] arr1 = {5,7,8,20,1,4,2};
		
		ArrayList<Integer> results = intersection(arr1, arr2);
		System.out.println(results);
	}
	
	private ArrayList<Integer> intersection(int[] arr1, int[] arr2){
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]){
					list.add(arr1[i]);
				}
			}
			
		}
		
		
		return list;
	}
}
