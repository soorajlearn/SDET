package week4.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class MoveOddNumbersToRight {

	@Test
	public void test1() {
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		
		next = next.replaceAll("\\{|\\}", "");
		String[] input = next.split(",");
		//String input = "{ 2, 1, 5, 3, 12 }";
		moveOddNumbersToRight(input);
		sc.close();
	}

	/*@Test
	public void test2() {
		String input = "{ 1,1,0,2,4 }";
		moveOddNumbersToRight(input);

	}*/

	private void moveOddNumbersToRight(String[] input) {

		/*Scanner sc = new Scanner(System.in);
		String next = sc.next();
		
		next = next.replaceAll("\\{|\\}", "");
		String[] input = next.split(",");*/
		
		ArrayList<Integer> oddArray = new ArrayList<>();
		ArrayList<Integer> evenArray = new ArrayList<>();
		int counter=0;

		for (int i = 0; i < input.length; i++) {
			if (Integer.parseInt(input[i]) % 2 == 0 && Integer.parseInt(input[i])!=0 ) {
				evenArray.add(Integer.parseInt(input[i]));
			} else if (Integer.parseInt(input[i]) % 2 == 1 && Integer.parseInt(input[i])!=0) {
				oddArray.add(Integer.parseInt(input[i]));
			} else{
				counter++;
			}
		}
		
		while(counter>0){
			evenArray.add(0);
			counter--;
		}

		evenArray.addAll(oddArray);

		System.out.println(evenArray);

	}

	private void moveOddNumbersToRight2(int[] input) {

		int left = 0, right = input.length - 1;
		while (left < right) {
			/* Increment left index while we see 0 at left */
			while (input[left] % 2 == 0 && left < right)
				left++;

			/* Decrement right index while we see 1 at right */
			while (input[right] % 2 == 1 && left < right)
				right--;

			if (left < right) {
				/* Swap arr[left] and arr[right] */
				int temp = input[left];
				input[left] = input[right];
				input[right] = temp;
				left++;
				right--;
			}

		}
		System.out.println(Arrays.toString(input));
	}
}
