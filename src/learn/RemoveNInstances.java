package learn;

import org.junit.Test;

public class RemoveNInstances {

	//@Test
	public void test1() {
		int[] input = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int n = 2;
		System.out.println(twoP(input, n));
	}
	
	//@Test
	public void test2() {
		int[] input = { -2,-2,-2, -2 };
		int n = -2;
		System.out.println(twoP(input, n));
	}
	
	@Test
	public void test3() {
		int[] input = { 0, 1, 2, 2, 0, 4, 2 };
		int n = 2;
		System.out.println(twoP(input, n));
	}

	public int bf(int[] input, int n) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == n)
				count++;
		}
		return input.length - count;

	}

	public int twoP(int[] input, int n) {
		int count = 0;
		int start = 0, end = input.length-1;
		while (start <= end) {
			if(start==end && input[start] == n){
				count++;
				break;
			}
			if (input[start++] == n) {
				count++;
			}
			if (input[end--] == n) {
				count++;
			}
		}
		return input.length - count;

	}
}
