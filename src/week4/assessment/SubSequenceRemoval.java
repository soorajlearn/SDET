package week4.assessment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SubSequenceRemoval {

	@Test
	public void test1() {
		//int[] input = {2,1,3,1,4,1,3};
		// int[] input = {2,2,2,2,2,2,2};
		//int[] input = { 3, 2, 2, 1, 1 };
		int[] input = {-2,-1,-3,-4,-1,0,-3};

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < input.length; i++) {
			arr.add(input[i]);
		}

		subSequenceRemoval(arr);

	}

	public void subSequenceRemoval(ArrayList<Integer> arr) {

		ArrayList<Integer> dup = new ArrayList<>();
		ArrayList<Integer> set = new ArrayList<>();

		for (Integer integer : arr) {
			if (!(set.contains(integer))) {
				set.add(integer);
			} else {
				if (dup.size()==0 || dup.get(dup.size()-1) <= integer ) {
					dup.add(integer);
				} else {
					dup.clear();
					dup.add(-1);
					break;
				}
			}
		}

		System.out.println(dup);
		System.out.println(set);
	}

}
