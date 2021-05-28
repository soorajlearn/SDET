package week13;

import java.util.Arrays;

import org.junit.Test;

public class ProductExceptItself {
	
	@Test
	public void test1(){
		int[] input = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptItself(input)));
	}
	
	public int[] productExceptItself(int[] input){
		int n=input.length;
		int[] left = new int[n];
		//int[] right = new int[n];
		
		left[0]=1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i-1]*input[i-1];
			
		}
		//right[n-1]=1;
		for (int i = n-2; i >=0; i--) {
			left[i]= left[i+1]*input[i+1]*left[i];
		}
		
		/*for (int i = 0; i < n; i++) {
			left[i] = left[i]*right[i];
		}*/
		
		return left;
	}
	

}
