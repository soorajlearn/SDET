package week2.assessment;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Q01_MoveZerosToEnd {

	@Test
	public void test1() {
		int[] input = { 1, 0, 5, 9, 0, 0, 6, 8 };
		//method1(input);
		//method2(input);
		method3(input);
	}

	@Test
	public void test2() {
		int[] input = { 1, 0, -5, -9, 0, 0, 6, 8 };
		/*method1(input);
		method2(input);*/
		method3(input);
	}

	public void method1(int[] input) {

		ArrayList<Integer> output = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] == 0) {
				count++;
			} else {
				output.add(input[i]);
			}
		}

		for (int j = 0; j <= count; j++) {
			output.add(0);
		}

		System.out.println(output);
	}

	public void method2(int[] input) {

		ArrayList<Integer> output = new ArrayList<>();

		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] != 0) {
				output.add(input[i]);
			}
		}

		int count = input.length - output.size();

		for (int j = 0; j < count; j++) {
			output.add(0);
		}

		System.out.println(output);
	}

	public void method3(int[] input) {

		for (int i = 0; i < input.length-1; i++) {

			
			if (input[i] == 0) {
				for (int j = i+1; j < input.length; j++) {
					int temp = input[j-1];
					input[j-1] = input[j];
					input[j] = temp;
				}

					

				

			}

		}
		System.out.println(Arrays.toString(input));
	}

}
