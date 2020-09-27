package week1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class HighestSumOfConsecutive {
	
	@Test
	public void example1(){
		int[] numbers = {1,2,3,29,4,7,8,9,10,9,3};
		int ele = 3;	
		highestSumOfConsecutive(numbers, ele);
	}
	
	@Test
	public void example2(){
		int[] numbers = {1,2,3,-29,4,7,8,9,10,9,3};
		int ele = 5;	
		highestSumOfConsecutive(numbers, ele);
	}
	
	@Test
	public void example3(){
		int[] numbers = {-1,-2,-3,-29,-4,-7,-8,-9,-10,-9,-3};
		int ele = 4;	
		highestSumOfConsecutive(numbers, ele);
	}
	
	
	private void highestSumOfConsecutive(int[] numbers, int target){
		
		/*ArrayList<Integer> listOfConsecutiveSum = new ArrayList<>();
		
		for (int i = 0; i < numbers.length ; i++) {
			int sum=0;
			for (int j = i; j < i+target ; j++) {
				sum = sum + numbers[j]; //O[N^2]
			}
			listOfConsecutiveSum.add(sum);
			if(i==numbers.length-target) break;
		}
		System.out.println(listOfConsecutiveSum);
		Collections.sort(listOfConsecutiveSum);//O[log N]
		Collections.reverse(listOfConsecutiveSum);//Math library
		
		System.out.println(listOfConsecutiveSum.get(0));*/
		
		int max_sum=0;
		for (int j = 0; j < target ; j++) {
			max_sum += numbers[j];
			
		}
		
		int window_sum = max_sum;
		
		for (int i = target; i < numbers.length; i++) {
			window_sum += numbers[i] - numbers[i-target];
			max_sum = Math.max(window_sum, max_sum);	
		}
		
		System.out.println(max_sum);
		
	}
	
	

}
