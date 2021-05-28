package week14;

import java.util.ArrayList;

import org.junit.Test;

public class FizzBuzz {
	
	/*
	 * 1) Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
n = 15,
Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]*/
	
	/*
	 * 1. Iterate using for loop from 1 till n'
	 * 2. If the input is divisible by both 3 & 5 , add fizzbuzz to the output
	 * 3. else if the input is divisible by  3, add fizz to te output
	 * 4. else if the input is divisible by  3, add fizz to te output
	 * 5. else add the integer to the output */
	@Test
	public void test1(){
		int n = 30;
		System.out.println(fizzbuzz(n));
	}
	
	public ArrayList<String> fizzbuzz(int n){
		ArrayList<String> output = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			
			if((i%3==0)&&(i%5==0)){
				output.add("FizzBuzz");
			}else if(i%3==0){
				output.add("Fizz");
			}else if(i%5==0){
				output.add("Buzz");
			}else{
				output.add(i+"");
			}	
		}
		
		
		return output;
	}

}
