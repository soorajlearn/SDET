package week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class CountingPairs {

	@Test
	public void test1() {

		List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 3);
		int k = 1;
		System.out.println(countPairs(numbers, k));
	}
	
	@Test
	public void test2() {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int k = 6;
		System.out.println(countPairs(numbers, k));
	}
	
	@Test
	public void test3() {

		List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 3);
		int k = 1;
		System.out.println(countPairs(numbers, k));
	}

	public static int countPairs(List<Integer> numbers, int k) {
		// Write your code here
		int count = 0;
		Set<Integer> set = new HashSet<>();
		set.addAll(numbers);
		for (Integer integer : numbers) {
			if (set.contains(integer + k)) {
				count++;
				set.remove(integer);
				set.remove(integer+k);
			}
		}
		return count;

	}

}
