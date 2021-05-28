package learn;

import java.util.Arrays;

import org.junit.Test;

public class FizzBuzz_2Ptr {
	
	@Test
	public void test1(){
		int n=200;
		System.out.println(Arrays.toString(fizzBuzz(n)));
	}
	
	/*
	 * 1. set start =1, end=n, and output string array of length n-1
	 * 	  when start is divisible by 3 && 5 set fizzbuzz to arr[start-1] position and start ++
	 * 	  
	 * 3. when end is divisible by 3 && 5 set fizz to arr[end-1] position and end--
	 * 2. when start is divisible by 3 set fizz to arr[start-1] position and start ++
	 * 3. when end is divisible by 3 set fizz to arr[end-1] position and end--
	 * 4. when start is divisible by 5 set buzz to arr[start-1] position and start ++
	 * 3. when end is divisible by 3 set buzz to arr[end-1] position and end-- */
	
	public String[] fizzBuzz(int n){
		int start=1, end=n;
		String[] output = new String[n];
		
		
		while(start<=end){
			if(start%3==0 && start%5 ==0){
				output[start-1] = "FizzBuzz";
			}else if(start%3 == 0){
				output[start-1] = "Fizz";
			}else if(start%5 == 0){
				output[start-1] = "Buzz";
			}else{
				output[start-1] = Integer.toString(start);
			}
			
			if(end%3==0 && end%5 ==0){
				output[end-1] = "FizzBuzz";
			}else if(end%3 == 0){
				output[end-1] = "Fizz";
			}else if(end%5 == 0){
				output[end-1] = "Buzz";
			}else{
				output[end-1] = Integer.toString(end);
			}
			
			
			start++;
			end--;
		}
		
		return output;
	}
}
