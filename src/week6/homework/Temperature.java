package week6.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

public class Temperature {
	
	@Test
	public void test1(){
		
		int[] input = {73,74,75,71,69,72,76,73};
		
		System.out.println(Arrays.toString(findWarmer(input)));
	}
	
	private int[]  findWarmer(int[] input){
		
		int[] output = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			int val=0;
			for (int j = i+1; j < input.length; j++) {
				System.out.println("I am here");
				val++;
				if(input[j]>input[i]){
					output[i]=val;
					break;
				}
				
			}
			
		}
		return output;
	}
	
	
	/*private int[]  findWarmer1(int[] input){
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < input.length; i++) {
			
			stack.push(input[i+1]-input[i])
			
		}
		
	}*/
	

}
