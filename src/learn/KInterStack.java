package learn;

import java.util.Arrays;

import org.junit.Test;

public class KInterStack {
	
	@Test
	public void test1()
	{
	    int[][] arr = {{2,3,4},{20,5},{1,20,3,3,5,6,7},{1,20,3,3,6,7,8,9}};
	    int len = intersectArrays(arr);
	    /*for (int i = 0; i < len; i++)
	        System.out.print(arr[0][i] + " ");*/
	    
	    System.out.println(Arrays.toString(Arrays.copyOf(arr[0], len)));
	}
	
	
	private static int intersectArrays(int[][] arrays) {
	    int len = arrays[0].length;
	    for (int i = 1; i < arrays.length; i++) {
	        len = intersect(arrays[0], len, arrays[i]);
	    }
	    return len;
	}	
	
	private static int intersect(int[] a, int alen, int[] b) {
	    int resLen = 0, bIndex = 0;
	    Arrays.sort(a);
	    Arrays.sort(b);
	    for (int aIndex = 0; aIndex < alen; aIndex++) {
	        while (bIndex < b.length && a[aIndex] > b[bIndex]) bIndex++;
	        if (bIndex == b.length) break;

	        if (a[aIndex] == b[bIndex]) {
	            a[resLen] = a[aIndex];
	            resLen++;
	            bIndex++;
	        }
	    }
	    return resLen;
	}
	

}
