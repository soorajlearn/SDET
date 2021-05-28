package learn;

import java.util.Arrays;

import org.junit.Test;

public class RotateAnArray {
	
	@Test
	public void test1(){
		
		int[] input = {1,2,3,4,5,6};
		int k =2;
		System.out.println(Arrays.toString(rotate(input, k)));
	}

	public int[] rotate(int[] input, int k) {
		swap(input,0, input.length - k - 1);
		swap(input,input.length - k, input.length-1);
		swap(input,0, input.length-1);
		return input;
	}

	public void swap(int[] input, int left, int right) {

		while (left < right) {
			int temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			left++;
			right--;
		}

	}

}
