package week3.weekend;

import org.junit.Test;

public class Q04_LongestSubstringWithoutRepeated {
	
	@Test
	public void example1() {
		String str = "pebdbfghi";
		System.out.println(longestSubString(str));
	}

	@Test
	public void example2() {
		String str = "bbbbb";
		System.out.println(longestSubString(str));
	}

	// Using ASCII 
	private int longestSubString(String str) {
		int n = str.length();
		int maxValue = 0;
		int i = 0; 
        int[] index = new int[128];
        for (int j = 1; j <=n; j++) {
            i = Math.max(index[str.charAt(j-1)], i);
            maxValue = Math.max(maxValue, j - i );
            index[str.charAt(j-1)] = j;
        }
        return maxValue;
	}

}
