package learn;

import org.junit.Test;

public class StringSubSeq {

	@Test
	public void test1() {
		System.out.println(isSubSeq("abc", "ahabbbbbbbgdc"));
	}

	@Test
	public void test2() {
		System.out.println(isSubSeq("axc", "ahabbbbbbbgdc"));
	}

	public boolean isSubSeq(String s1, String s2) {

		int starts1 = 0;

		for (int i = 0; i < s2.length(); i++) {

			if ((s2.charAt(i) == s1.charAt(starts1) && starts1 < s1.length())) {
				starts1++;
			}
		}

		if (starts1 != s1.length())
			return false;

		return true;
	}

}
