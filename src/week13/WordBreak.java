package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class WordBreak {

	/*
	 * @Test public void test1(){ String s ="applepenapple"; List<String> list =
	 * new ArrayList<String>(); list.add("apple"); list.add("pen");
	 * System.out.println(wordbreak(s, list)); }
	 */
	@Test
	public void test2() {
		String s = "catsandog";
		List<String> list = new ArrayList<String>();
		list.add("cats");
		list.add("dog");
		list.add("sand");
		list.add("and");
		list.add("cat");
		System.out.println(wordbreak(s, list));
	}

	@Test

	public void example2() {

		String s = "applepenapple";

		List<String> li = new ArrayList<String>();

		li.add("apple");

		li.add("pen");

		System.out.println(wordbreak(s, li));

	}

	@Test

	public void example3() {

		String s = "catsandog";

		List<String> li = new ArrayList<String>();

		li.add("cats");

		li.add("dog");

		li.add("sand");

		li.add("and");

		li.add("cat");

		System.out.println(wordbreak(s, li));

	}

	@Test

	public void example4() {

		String s = "abcd";

		List<String> li = Arrays.asList(new String[] { "a", "abc", "b", "cd" });

		System.out.println(wordbreak(s, li));

	}

	public boolean wordbreak(String s, List<String> list) {

		ArrayList<String> list2 = new ArrayList<>();
		list2.addAll(list);

		for (String string : list) {

			if (s.contains(string)) {

				s = s.replaceAll(string, "");

				list2.remove(string);
			} else if (!s.contains(string)) {
				return false;
			}

		}

		if (list2.isEmpty())
			return true;

		return false;

	}

}
