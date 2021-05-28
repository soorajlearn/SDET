package sort;

import java.util.Arrays;

import org.junit.Test;

public class MergeSort {

	@Test
	public void test1() {
		int[] input = { 11, 4, 17, 18, 2, 22, 1, 8 };
		System.out.println(Arrays.toString(mergeSort(input)));
	}

	// @Test
	public void test2() {
		int[] input = { 2, 3, 4, 4, 5, 6, 7, 8, 5 };
		System.out.println(Arrays.toString(mergeSort(input)));
	}

	// @Test
	public void test3() {
		int[] input = { 11, 4, 17, -18, 2, 22, 1, 8 };
		System.out.println(Arrays.toString(mergeSort(input)));
	}

	// @Test
	public void test4() {
		int[] input = { 1, 5, 8, 12, 22, 35, 67, 89 };
		System.out.println(Arrays.toString(mergeSort(input)));
	}

	public int[] mergeSort(int[] input){
	  //recurse(int[] input, 0, input.length-1);
	  return input;
	}

	public void recurse(int[] input, int left, int right) {

		int mid = (left + right) / 2;
		while (left < right) {
			recurse(input, left, mid);
			recurse(input, mid+1, right);
			merge(left, mid, right);
		}

	}

	public void merge(int left, int mid, int right) {

		//int l[] = Arrays.copyOfRange(input, left, mid);
		//int r[] = Arrays.copyOfRange(input, mid+1, right);
		
		
	}

}
