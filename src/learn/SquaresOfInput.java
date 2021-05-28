package learn;

import java.util.Arrays;

import org.junit.Test;

public class SquaresOfInput {

	@Test
	public void test1() {

		int[] input = { -8, -4, -3, 3, 4, 10 };
		System.out.println(Arrays.toString(sortedSquares(input)));
	}

	public int[] sortedSquares(int[] input) {
		int start = 0, end = input.length - 1;
		int[] output = new int[input.length];

		for (int j = input.length - 1; j >= 0; j--) {
			if (start < end) {
				if (Math.abs(input[start]) >= Math.abs(input[end])) {
					output[j] = input[start] * input[start];
					start++;
				} else if (Math.abs(input[end]) >= Math.abs(input[start])) {
					output[j] = input[end] * input[end];
					end--;
				} 
			}
		}
		return output;
	}

}
