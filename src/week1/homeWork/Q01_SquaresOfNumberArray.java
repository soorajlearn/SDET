package week1.homeWork;
import java.util.Arrays;

import org.junit.Test;

public class Q01_SquaresOfNumberArray {
	
	@Test
	public void test1(){
		int[] numbers={-8,-3,2,3,10};
		if(increasingArray(numbers) == true){
			sortedSquareArray(squaresOfArray(numbers));
		}
	}
	
	private boolean increasingArray(int[] numbers){
		boolean result = false;
		for (int i = 0; i < numbers.length-1; i++) {
			if(numbers[i]<=numbers[i+1]) {
				result = true;
			}
			else {
				result = false;
				System.out.println("Not an increasing array");
				break;
			}
				
		}
		return result;
	}

	private int[] squaresOfArray(int[] numbers){
		int[] squareResultant = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			squareResultant[i]=numbers[i]*numbers[i];
		}
		System.out.println(Arrays.toString(squareResultant));
		return squareResultant;
	}

	private void sortedSquareArray(int[] squareArray){
		Arrays.sort(squareArray);
		System.out.println(Arrays.toString(squareArray));
	}

}
