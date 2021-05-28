package week11.homeWork;

import org.junit.Test;

public class GreatestSumBasedK {

	/*
	 * find the greatest sum of numbers based on the k value given:
	 * 
	 * 
	 * input : [10,3,33,5,2,32,21,14,17,8,9] & k=3
	 * 
	 * output :
	 * 
	 * 1) first step you should add every 3 numbers (10,3,33) (3,33,5) (33,5,2)
	 * (5,2,32) (2,32,21) etc.....
	 * 
	 * then you should find the greatest sum out of all these and print it
	 * 
	 * if suppose k=2 then you should go with (10,3) (3,33) (33,5) (5,2)
	 * etc.....
	 * 
	 * Note : array values and k value will be provided at the runtime
	 */

	@Test
	public void test1() {
		int[] input = { 10, 3, 33, 5, 2, 32, 21, 14, 17, 8, 90 };
		int k = 4;

		System.out.println(greatestSum(input, k));
		System.out.println(greatestSum1(input, k));
	}

	public int greatestSum(int[] input, int k) {

		//O[N*M]
		int output = 0;

		for (int i = 0; i < input.length - k + 1; i++) {
			int maxsum = 0;
			for (int j = i; j < i + k; j++) {
				maxsum += input[j];
			}
			output = Math.max(output, maxsum);
		}

		return output;

	}

	public int greatestSum1(int[] input, int k) {

		
		int output = 0, maxSum=0;
		//O[N]
		for(int i=0; i<k;i++){
			maxSum += input[i];
		}
		//O[N]
		for (int i = k; i < input.length; i++) {
			maxSum += input[i]-input[i-k];
			output = Math.max(output, maxSum);
		}

		return output;

	}
}
