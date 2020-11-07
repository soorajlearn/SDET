package week3.weekend;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class Q01_GetPrime {

	@Test
	public void test1() {
		int input = 403198305;
		getAllPrime(getAllPossibleNumbers(input));
	}
	
	@Test
	public void test2() {
		int input = 44;
		getAllPrime(getAllPossibleNumbers(input));
	}
	
	@Test
	public void test3() {
		int input = 793;
		getAllPrime(getAllPossibleNumbers(input));
	}

	private ArrayList<Integer> getAllPossibleNumbers(int input) {
		ArrayList<Integer> list = new ArrayList<>();

		String s = String.valueOf(input);
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				CharSequence subSequence = s.subSequence(i, j);
				list.add(Integer.parseInt((String) subSequence));
			}
		}
		System.out.println(list);

		return list;

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
			
			if (!flag && object>=2) {
				
				if(!(list.contains(object)))
				list.add(object);		
			}

		}
		
		System.out.println(list);
	}


}
