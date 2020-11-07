package week4.weekAssessment;

import java.util.Arrays;

import org.junit.Test;

public class MoveOddNumbers {
	@Test
	public void test(){
		int[] input = {0,1,1,2,4};
		moveOddToRight(input);
	}
	
	private void moveOddToRight(int[] input){

		System.out.println(Arrays.toString(input));
		
	}

}
