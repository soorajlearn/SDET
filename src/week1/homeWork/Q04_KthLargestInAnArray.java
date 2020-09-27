package week1.homeWork;
import java.util.Arrays;

import javax.management.RuntimeErrorException;

import org.junit.Test;

public class Q04_KthLargestInAnArray {
	
	@Test
	public void example1(){
		int[] numbers = {11,2,5,3,8,7,22,48,26,22,25,21,26};
		int k = 4;
		kthLargestInArray(numbers, k);
	}
	@Test
	public void example2(){
		int[] numbers = {11,2,5,3,8,7,22,48,26,22,25,21,26};
		int k = 4;
		kthLargestInArray(numbers, k);
	}
	@Test
	public void example3(){
		int[] numbers = {11,2,5,3,8,7,-22,48,26,-22,-25,21,26};
		int k = 4;
		kthLargestInArray(numbers, k);
	}
	@Test
	public void example4(){
		int[] numbers = {-26,-25,-21,-26};
		int k = 2;
		kthLargestInArray(numbers, k);
	}
	@Test
	public void example6(){
		int[] numbers = {3,2,3,1,2,4,5,5,6};
		int k = 3;
		kthLargestInArray(numbers, k);
	}
	
	public void kthLargestInArray(int[] numbers, int k){
		
		
		Arrays.sort(numbers);//O[logN]
		System.out.println(Arrays.toString(numbers));
		if(k>numbers.length) System.out.println("Invalid Input");
		else System.out.println(numbers[numbers.length-k]);
		
		
		
	}

}
