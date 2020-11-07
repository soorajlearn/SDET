package week2.homeWork;

import java.util.Arrays;

import org.junit.Test;

public class Q02_RotateAnImage {

	@Test
	public void test1() {
		int[][] input = { { 1, 2, 3 }, 
							{ 4, 5, 6 }, 
							{ 7, 8, 9 } };
		rotateArray(input);

	}
	
	@Test
	public void test2() {
		int[][] input = { { 1, 2, 3, 4 }, { 4, 5, 6, 8 }, { 7, 8, 9, 10 } };
		rotateArray(input);

	}
	
	@Test
	public void test3() {
		int[][] input = { { -1, 2}, { 4, 5 }};
		rotateArray(input);

	}

	public void rotateArray(int[][] input) {
		int[][] output = new int[input[0].length][input.length];
		int l = 0;
		for (int i = 0; i < input[0].length; i++) {
			int k = input.length - 1;		
				for (int j = 0; j < input.length; j++) {
					System.out.println("I am here");
					output[i][j] = input[k][l];
					k--;
				}
			l++;
		}

		System.out.println(Arrays.deepToString(output));
	}
}
