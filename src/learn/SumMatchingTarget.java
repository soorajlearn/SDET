package learn;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SumMatchingTarget {

	@Test
	public void test1() {
		int[] arr = { 1, 7, 4, 3, 4, 1, 2, 5, 1 };
		int target = 7;
		System.out.println(sumMatchingTarget(arr, target));
	}

	public ArrayList<ArrayList<Integer>> sumMatchingTarget(int[] arr, int target) {
		ArrayList<ArrayList<Integer>> output = new ArrayList<>();

		int start = 0, end = 0, goal = target;

		while (start < arr.length && end < arr.length) {
			goal = goal - arr[end];
			if (goal == 0) {
				output.add(new ArrayList(Arrays.asList(start, end)));
				start = end;
				goal = target;
				if (arr[end] == target) {
					start++;
					end++;
				}else{
					goal -=arr[start];
					end++;
				}
			} else if (goal > 0) {
				end++;
			} else {
				start = end;
				goal = target;
			}
		}

		return output;
	}

}
