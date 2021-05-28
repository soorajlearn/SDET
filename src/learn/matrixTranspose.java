package learn;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class matrixTranspose {

	@Test
	public void test1() {
		int[][] input = { { 1, 2, 3, 1 }, { 4, 5, 6, 1 }, { 7, 8, 9, 1 } };
		System.out.println(getTranspose(input));
		System.out.println(Arrays.toString(getTranspose1(input)));
	}

	@Test
	public void test2() {
		int[][] input = { { 1, 2 }, { 4, 5 }, { 7, 8 } };
		System.out.println(getTranspose(input));
		System.out.println(Arrays.toString(getTranspose1(input)));
	}

	public ArrayList<ArrayList<Integer>> getTranspose(int[][] input) {

		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();

		int row = input.length;
		int column = input[0].length;

		for (int i = 0; i < column; i++) {
			ArrayList<Integer> inter = new ArrayList<>();
			for (int j = 0; j < row; j++) {
				inter.add(input[j][i]);
			}
			output.add(inter);
		}
		return output;

	}

	public int[][] getTranspose1(int[][] input) {

		

		int row = input.length;
		int column = input[0].length;
		
		int[][] output = new int[column][row];

		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				output[i][j]=input[j][i];
			}
		}
		return output;

	}

}
