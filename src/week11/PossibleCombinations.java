package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class PossibleCombinations {

	@Test
	public void test1() {
		Integer[] input = { 1, 2, 3, 6, 7 };
		int k = 7;
		System.out.println(possibleCombinations(input, k));
	}

	public ArrayList<ArrayList<Integer>> possibleCombinations(Integer[] input, int k) {

		ArrayList<ArrayList<Integer>> output = new ArrayList<>();

		getPossibleCombinations(input, k, output);

		return output;

	}

	public ArrayList<ArrayList<Integer>> getPossibleCombinations(Integer[] input, int k,
			ArrayList<ArrayList<Integer>> output) {

		ArrayList<Integer> array_list = new ArrayList<Integer>(Arrays.asList(input));

		for (int i = 0; i < input.length; i++) {
			ArrayList<Integer> comb = new ArrayList<>();
			int q = k / input[i];
			int r = k % input[i];

			for (int j = 0; j < q; j++) {
				comb.add(input[i]);
			}
			if (array_list.contains(r))
				comb.add(r);

			output.add(comb);

			// getPossibleCombinations(input, k-input[i], output);

		}

		return output;
	}

}
