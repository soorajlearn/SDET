package learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SecondMax {
	
	@Test
	public void test1(){
		
		int[] input = {3,3,3,3,4,4,4,4,4,6,6,6,6,1,1,1,1};
		System.out.println(getSecondMax(input));
	}

	public ArrayList<Integer> getSecondMax(int[] input) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = 0, secondMax = 0;
		for (int i = 0; i < input.length; i++) {
			map.put(input[i], map.getOrDefault(input[i], 0) + 1);

			if (map.get(input[i]) > max) {
				secondMax = max;
				max = map.get(input[i]);
			} else if (map.get(input[i]) > secondMax) {
				secondMax = map.get(input[i]);
			}

		}

		for (Map.Entry entry : map.entrySet()) {
			if ((int)entry.getValue() == secondMax)
				list.add((int)entry.getKey());
		}

		return list;

	}

}
