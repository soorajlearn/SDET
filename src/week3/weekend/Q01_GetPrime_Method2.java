package week3.weekend;

import java.util.ArrayList;

import org.junit.Test;

public class Q01_GetPrime_Method2 {

	@Test
	public void test1() {
		int input = 403198305;
		getAllPrime(getPrime(input));
	}
	
	@Test
	public void test2() {
		int input = 44;
		getAllPrime(getPrime(input));
	}
	
	@Test
	public void test3() {
		int input = 737;
		getAllPrime(getPrime(input));
	}

	private ArrayList<Integer> getPrime(int input) {
		int count = 0;
		int temp = input;
		while (temp >= 1) {
			temp = temp / 10;
			count++;
		}
		//System.out.println(count);

		// ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr1 = new ArrayList<>();
		int n = (int) Math.pow(10, count - 1);
		// int temp1 = n;

		//System.out.println(n);

		/*
		 * while (temp1 > 1) { arr.add(input % temp1); temp1 = temp1 / 10; }
		 */
		
		
		int temp2 = n;
		for (int i = 0; i < count - 1; i++) {
			int temp1 = n;
			while (temp1 >= 1) {
				
				if (!arr1.contains(input / temp1))
					arr1.add(input / temp1);
				temp1 = temp1 / 10;
			}
			input = input % temp2;
			arr1.add(input);
			temp2 = temp2 / 10;
			
		}

		//System.out.println(arr1);
		return arr1;

	}

	private void getAllPrime(ArrayList<Integer> s) {

		ArrayList<Integer> list = new ArrayList<>();

		for (Integer object : s) {

			boolean flag = false;
			for (int i = 2; i <= object / 2; i++) {
				if (object % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag && object >= 2) {

				if (!(list.contains(object)))
					list.add(object);
			}

		}

		System.out.println(list);
	}

}
