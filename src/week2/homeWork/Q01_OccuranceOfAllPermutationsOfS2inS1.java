package week2.homeWork;

import java.util.ArrayList;

import org.junit.Test;

public class Q01_OccuranceOfAllPermutationsOfS2inS1 {

	@Test
	public void test1() {
		String s1 = "ab";
		String s2 = "eidbsaooo";
		occuranceOfS1inS2(s1, s2);
	}

	@Test
	public void test2() {
		String s1 = "ab";
		String s2 = "eidbaooo";
		occuranceOfS1inS2(s1, s2);
	}

	@Test
	public void test3() {
		String s1 = "cab";
		String s2 = "eidbcaooo";
		occuranceOfS1inS2(s1, s2);
	}
	
	@Test
	public void test4() {
		String s1 = "abc";
		String s2 = "ab";
		occuranceOfS1inS2(s1, s2);
	}

	/*
	 * public static void permutation(String str) { permutation("", str); }
	 * 
	 * private static void permutation(String prefix, String str) { int n =
	 * str.length(); if (n == 0) System.out.println(prefix); else { for (int i =
	 * 0; i < n; i++) permutation(prefix + str.charAt(i), str.substring(0, i) +
	 * str.substring(i+1, n)); } }
	 */

	public void occuranceOfS1inS2(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();

		if (n1 > n2) {
			System.out.println("Invalid input");
		}

		else {
			ArrayList<String> s = new ArrayList<>();
			permute(s1, 0, n1 - 1, s);
			System.out.println(s);
			int count = 0;
			for (String string : s) {
				if (s2.contains(string)) {
					count++;
				}
			}
			if (count > 0) {
				
				
				System.out.println("s1 is available in s2");
			} else {
				System.out.println("s1 is not available in s2");
			}
		}
	}

	private ArrayList<String> permute(String str, int l, int r, ArrayList<String> s) {

		if (l == r) {
			s.add(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r, s);
				str = swap(str, l, i);
			}
		}
		return s;

	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
