package week1.homeWork;
import java.util.Arrays;

import org.junit.Test;

public class Q06_EleProducts {
	@Test
	public void test1(){
		int[] numbers = {1,2,3,4};
		int[] eleProd = eleProd(numbers);	
		System.out.println(Arrays.toString(eleProd));
	}
	@Test
	public void test2(){
		int[] numbers = {10};
		int[] eleProd = eleProd(numbers);	
		System.out.println(Arrays.toString(eleProd));
	}
	@Test
	public void test3(){
		int[] numbers = {0,3,2,1,8,2};
		int[] eleProd = eleProd(numbers);	
		System.out.println(Arrays.toString(eleProd));
	}

	
	private int[]  eleProd(int[] numbers){
		int[] output = new int[numbers.length];
		if(numbers.length==1){
			System.out.println("Invalid input");
		}
		
		else{
			
			int prod =1;
			for (int i = 0; i < numbers.length; i++) {
				prod *=numbers[i];
			}
			for (int i = 0; i < output.length; i++) {
				output[i]=prod/numbers[i];
			}
			
		}
		return output;
	
	}
}
