package week1.homeWork;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Q05_MissingNumbers {
	@Test
	public void test1() {
		int[] numbers = { 4, 3, 2, 8, 2, 3, 1,7 };
		missingNumbers(sortArray(numbers));
	}
	
	@Test
	public void test2() {
		int[] numbers = { 4, 3, 2, 8, 2, 3, 1,7,11 };
		missingNumbers(sortArray(numbers));
	}
	@Test
	public void test3() {
		int[] numbers = { -4, 3, 2, 8, 2, 3, 1,7,11 };
		missingNumbers(sortArray(numbers));
	}
	@Test
	public void test4() {
		int[] numbers = { -4, 3, 2, 8, 2, 3, 1,7,-11 };
		missingNumbers(sortArray(numbers));
	}


	private void missingNumbers(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length-1; i++) {
			//enter the if condition only if the number is missing 
			if (numbers[i+1]!=numbers[i]+1 && numbers[i+1]!=numbers[i]) { 
				list.add(numbers[i]+1);
				int j = 2;
				while(numbers[i+1]!=numbers[i]+j) {
					list.add(numbers[i]+j);		
					j++;
				}
			}
		}
		System.out.println(list);
	}

	private int[] sortArray(int[] numbers) {
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		return numbers;
	}

}
