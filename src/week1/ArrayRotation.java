package week1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ArrayRotation {
	
	@Test
	public void example1(){
		int[] numbers = {2,3,11,4,7,8};
		int ele = 2;
		int[] rotatedArray = rotateArray(numbers, ele);
		System.out.println(Arrays.toString(rotatedArray));
	}
	@Test
	public void example2(){
		int[] numbers = {2,3,11,4,-7,8};
		
		int ele = 6;
		int[] rotatedArray = rotateArray(numbers, ele);
		System.out.println(Arrays.toString(rotatedArray));
	}
	@Test
	public void example3(){
		int[] numbers = {2,3,11,11,7,8};
		int ele = 7;
		int[] rotatedArray = rotateArray(numbers, ele);
		System.out.println(Arrays.toString(rotatedArray));
	}
	
	@Test
	public void example4(){
		int[] numbers = {2,3,11,4,7,8,1,1};
		int ele = 10;
		int[] rotatedArray = rotateArray(numbers, ele);
		System.out.println(Arrays.toString(rotatedArray));
	}
	
	
	private int[] rotateArray(int[] numbers, int ele){
		
		ArrayList<Integer> out = new ArrayList<>();
		
		
		int[] output = new int[numbers.length];
		
		//ele -- number of rotations
		//pos - from which position we have to rotate
		int pos = numbers.length-ele;
		if(ele>numbers.length){
			pos = numbers.length - (ele%numbers.length);//O[1]
		}
		int l=0;
		for(int j=pos; j<numbers.length;j++){
			
			//out.add(numbers[j]);//O[N]
			output[l]=numbers[j];
			l++;
		}
		
		for (int k = 0; k <pos; k++) {
			//out.add(numbers[k]);//O[N]
			output[l]=numbers[k];
			l++;
		}
		
		return output;
		
	}

}
