package week17;

import java.util.HashSet;

import org.junit.Test;

public class LSbWithReplacement {

	//@Test
	public void test1() {
		String input = "AABAAB";
		int k = 2;
		System.out.println(getMaxLength(input, k));
	}

	//@Test
	public void test2() {
		String input = "AABBBB";
		int k = 2;
		System.out.println(getMaxLength(input, k));
	}

	@Test
	public void test3() {
		String input = "AABBBBCCC";
		int k = 3;
		System.out.println(getMaxLength1(input, k));
	}

	//@Test
	public void test4() {
		String input = "ABCDE";
		int k = 1;
		System.out.println(getMaxLength(input, k));
	}

	//@Test
	public void test5() {
		String input = "ABCDABCCC";
		int k = 4;
		System.out.println(getMaxLength(input, k));
	}

	/*
	 * Use 2 pointers both in index 0 have a set , if the set doesnot contains
	 * character
	 * 
	 * add the character until <=k while counter==k, assign start = start+1;
	 * 
	 * if the set contains character,assign the end- start as max
	 * 
	 * 
	 * 
	 * 
	 */

	public int getMaxLength1(String input, int k) {

		int start = 0, end = 0;

		int n = input.length();
		HashSet<Character> set = new HashSet<>();
		int max = Integer.MIN_VALUE;
		int counter = k;
		while (start < n && end < n) {

			if (set.contains(input.charAt(end))) {

					max = Math.max(max, end - start + 1);
					end++;

			} else {
				set.add(input.charAt(end));
				if (counter >0) {
					max = Math.max(max, end - start + 1);
					end++;
					counter--;
				} else {
					
					max = Math.max(max, end - start + 1);
					start++;
					counter++;
					//counter--;
				}

			}

		}

		return max;

	}
	
	public int getMaxLength(String s, int k) {
        int len = s.length();
        int[] count = new int[128];
        int start = 0, maxCount = 0, maxLength = 0;
        for (int end = 0; end < len; end++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(end)]);
            if(maxCount + k <= end - start) {
                count[s.charAt(start++)]--;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

}
