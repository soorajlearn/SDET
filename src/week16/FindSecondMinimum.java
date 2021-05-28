package week16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class FindSecondMinimum {

	@Test
	public void test1() {
		Integer[] input = { 2, 4, 1, 3, 5, 1, -1, 2 , -1, 0};
		System.out.println(secondMin(input));
		System.out.println(secondMin1(input));
	}

	public int secondMin(Integer[] n) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			if (!list.contains(n[i])) {
				list.add(n[i]);
			}
		}
		Collections.sort(list);
		return list.get(1);

	}
	
	
	public int secondMin1(Integer[] n) {

		
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for (int i = 0; i < n.length; i++) {
			if(n[i]<min){
				secondMin=min;
				min=n[i];
			}else if(n[i]>min && n[i] <secondMin){
				secondMin=n[i];
			}
		}
		
		return secondMin;

	}
}
