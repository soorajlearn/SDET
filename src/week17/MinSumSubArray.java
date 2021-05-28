package week17;

import java.util.Arrays;

import org.junit.Test;

public class MinSumSubArray {

	/*
	 * Given an integer array, find the contiguous sub array of length k, with
	 * the minimum sum !! Return Sub array Return empty array when you k >
	 * array.length Return the first minimum sub array when multiple matches
	 */
	@Test
	public void example1() {
		int[] input = { 1, 4, 2, 8, 7, 2, 1 };
		int k = 3;
		System.out.println(Arrays.toString(bf(input, k)));
		System.out.println(Arrays.toString(windowS(input, k)));
	}

	@Test
	public void example2() {
		int[] input = { 1, 4, 2, 1, -7, 2, 1 };
		int k = 3;
		System.out.println(Arrays.toString(bf(input, k)));
		System.out.println(Arrays.toString(windowS(input, k)));
	}

	@Test
	public void example3() {
		int[] input = { 1, 4 };
		int k = 3;
		System.out.println(Arrays.toString(bf(input, k)));
		System.out.println(Arrays.toString(windowS(input, k)));
	}

	@Test
	public void example4() {
		int[] input = { -1, -4, -2, -1, -7, -2, -1 };
		int k = 3;
		System.out.println(Arrays.toString(bf(input, k)));
		System.out.println(Arrays.toString(windowS(input, k)));
	}

	/*
	 * 1. Brute Force O[N*M] 1. loop using for , from 0th index to
	 * input.length-k 2. use inner while loop to find the window sum 3. compare
	 * with min value and find the min value 4. return the subarray using copy
	 * of range
	 */

	public int[] bf(int[] input, int k) {
		int min = Integer.MAX_VALUE;
		int left = 0, right = 0;
		for (int i = 0; i < input.length- k; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += input[j];
			}
			if (sum < min) {
				min = sum;
				left = i;
				right = i + k;
			}
		}
		return Arrays.copyOfRange(input, left, right);

	}

	/*
	 * 2. Window Sliding O[N]
	 * 
	 * 1. initially use while to to find sum till 0th index to k 2. then use for
	 * loop from 0 till input.length - k reduce input[i] and add input[i+k+1] 3.
	 * return the subarray using copy of range
	 **/

	public int[] windowS(int[] input, int k) {

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += input[i];
		}

		int min = sum;
		int left = 0, right = k;
		for (int i = 0; i < input.length- k; i++) {

			sum = sum - input[i] + input[i+k];
			if(sum<min){
				min = sum;
				left = i+1;
				right = i + k+1;			
			}
		}
		return Arrays.copyOfRange(input, left, right);
	}

}
