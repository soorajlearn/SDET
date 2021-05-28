package learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TwoProductUsingMap {
	@Test
	public void test1() {
		int[] arr = { 2, 7, 11, 4, 15 };
		int target = 8;
		System.out.println(Arrays.toString(getIndices(arr, target)));

	}
	
	@Test
	public void test2() {
		int[] arr = { 2, 7, 11, 4, 15 };
		int target = 77;
		System.out.println(Arrays.toString(getIndices(arr, target)));

	}
	
	@Test
	public void test3() {
		int[] arr = { 2, 7, 11, 4, 15 };
		int target = 30;
		System.out.println(Arrays.toString(getIndices(arr, target)));

	}
	
	@Test
	public void test4() {
		int[] arr = { 2, 7, 11, 4, 15 };
		int target = 33;
		System.out.println(Arrays.toString(getIndices(arr, target)));
	}
	
	@Test
	public void test5() {
		int[] arr = { 2, 7, 11, 7, 15 };
		int target = 14;
		System.out.println(Arrays.toString(getIndices(arr, target)));

	}

	public int[] getIndices(int[] arr, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.isEmpty() && map.containsKey(arr[i])) {
				return new int[] {map.get(arr[i]),i };
			} else {
				if (target % arr[i] == 0) {
					map.put(target / arr[i], i);
				}
			}

		}
		return new int[] { -1, -1 };
	}

}
