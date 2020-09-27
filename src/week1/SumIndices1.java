package week1;
import java.util.Arrays;

import org.junit.Test;

public class SumIndices1 {

	
	//Brute Force Technique
	
	private int[] getSumIndices(int[] numbers, int target){
		 for (int i = 0; i < numbers.length; i++) {
			 for (int j = i+1; j < numbers.length; j++) {
				 if(numbers[i]+numbers[j] == target){
					 System.out.println("The indices are: "+ i + "&"+j);
					 return new int[] {i,j};
				 }
				
			}
			
		}
		 throw new RuntimeException("There is no matching indices");
		
	}
	
	@Test
	public void example1(){
		int[] numbers = {2,3,1,4,7,8};
		int target = 5;
		int[] sumIndices = getSumIndices(numbers, target);
		System.out.println(Arrays.toString(sumIndices));
	}
	
	@Test
	public void example2(){
		int[] numbers = {12,3,1,4,7,-3};
		int target = 5;
		int[] sumIndices = getSumIndices(numbers, target);
		System.out.println(Arrays.toString(sumIndices));
	}
	@Test
	public void example3(){
		int[] numbers = {12,3,1,4,7,7};
		int target = 5;
		int[] sumIndices = getSumIndices(numbers, target);
		System.out.println(Arrays.toString(sumIndices));
	}
	@Test
	public void example4(){
		
	}
}
