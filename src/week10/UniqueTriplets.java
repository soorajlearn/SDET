package week10;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class UniqueTriplets {

	/*
	 * 1. Declare start=1, end= input.length-1, output which is list of
	 * arraylists 2. Sort the input & Loop thru the array 3. if
	 * input[i]+input[start]+input[end] =0, add the positions to the resultant
	 * arraylist, add the resultant only when the output doesnot contain the
	 * resultant 4. If not, if the total sum < 0, increment the start, else if
	 * sum>0, decrement the end 5.
	 */

	@Test
	public void test1() {
		int[] input = { -1, 0, 1, 2, -1, -4 };
		System.out.println(uniqueTriplets(input));
	}

	public ArrayList<ArrayList<Integer>> uniqueTriplets(int[] input) {

		ArrayList<ArrayList<Integer>> output = new ArrayList<>();
		
		
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			int start = i+1, end = input.length - 1, sum = 0;
			while (start < end) {
				sum = input[i] + input[start] + input[end];

				if (sum == 0) {
					ArrayList<Integer> resultant = new ArrayList<>();
					resultant.add(input[i]);
					resultant.add(input[start]);
					resultant.add(input[end]);

					if (!output.contains(resultant)) {
						output.add(resultant);
					}
					start++;
					end--;
				} else if (sum < 0) {
					start++;
				} else {
					end--;
				}
			}

		}

		return output;

	}
}
