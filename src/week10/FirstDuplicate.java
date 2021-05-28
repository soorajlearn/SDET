package week10;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FirstDuplicate {
	
	@Test
	public void test1(){
		int[] input = {4,1,2,9,1};
		
	}
	
	public int firstDuplicate(int[] input) throws Exception{
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < input.length; i++) {
			if(!set.add(input[i])){
				return input[i];
			}else{
				set.add(input[i]);
			}
		}
		
		throw new Exception("No Duplicates");
		
	}
	
	
	

}
