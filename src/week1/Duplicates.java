package week1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Duplicates {
	
	@Test
	public void example1(){
		int[] numbers = {2,3,11,4,7,8,3,4};
		getDuplicates(numbers);
		//System.out.println(Arrays.toString(duplicatesArray));
	}
	
	private void getDuplicates(int[] numbers){
		
		ArrayList<Integer> out = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			map.put(numbers[i], i);
		}
		
		for (int j = 0; j < numbers.length; j++) {
			if(map.containsKey(numbers[j])){
				
			}
		}
		
		
	}
	

}
