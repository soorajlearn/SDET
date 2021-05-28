package week15;

import java.util.ArrayList;

import org.junit.Test;

public class JumpGame {

	@Test
	public void test1() {
		int[] num = { 3, 3, 4, 4, 6, 4, 8, 2, 6, 2, 4, 1, 4, 2, 4, 6, 2, 5, 4, 6, 4, 3, 3, 5 };
		System.out.println(jumpGame(num));
	}

	@Test
	public void test2() {
		int[] num = { 1, 3, 4, 6, 1, 2, 6, 1, 8 };
		System.out.println(jumpGame(num));
	}

	@Test
	public void test3() {
		int[] num = { 3, 3, 4, 4, 6, 4, 8, 2, 6, 2, 4, 1, 4, 2, 4, 6, 2, 5, 4, 6, 4, 3, 3, 5, 2, 6, 3, 5, 2, 4, 1, 5, 1,
				3, 1, 6, 1, 5, 1, 5, 2, 3, 4, 5, 1, 6, 9 };
		System.out.println(jumpGame(num));
	}

	public int jumpGame(int[] num) {
		int output = 0;
		int temp = 0;

		if (num[0] == 0) {
			return 0;
		} else {

			while (temp < num.length - 1) {
				if (num[temp] != 0) {
					temp = calcJump(num, temp, num[temp]);
					output++;
				}
			}

		}

		return output;
	}

	public int calcJump(int[] num, int from, int to) {

		if ((from + to) > num.length - 1) {
			return num.length - 1;
		} else {
			int max = num[from + 1];
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = from + 1; i <= from + to; i++) {
				list.add(num[i]);
				max = Math.max(max, num[i]);
			}

			if (max <= num[from] && from + to <= num.length - 1) {
				return from + to;
			}else if(max>num[from]){
				return from + list.lastIndexOf(max) + 1;
			}else if (list.lastIndexOf(max) >= list.size() / 2) {
			
				return from + list.lastIndexOf(max) + 1;
			} else {
				int max1 = list.get(list.size() / 2);
				ArrayList<Integer> list1 = new ArrayList<Integer>();
				for (int i = (list.size() / 2); i < list.size(); i++) {
					list1.add(list.get(i));
					max1 = Math.max(max1, list.get(i));
				}
				return from + list.lastIndexOf(max1) + 1;
			}
			
		}

	}

}
