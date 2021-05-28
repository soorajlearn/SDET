package week16;

import org.junit.Test;

public class NumberOfRotations {

	@Test
	public void test1() {
		int[] n = { 5, 6, 7,8, 1, 2 };
		System.out.println(getRotations(n));
	}

	

	private int getRotations(int[] n) {

		
		return recurse(n, 0, n.length - 1);

	}

	private int recurse(int[] n, int left, int right) {
		
			if(right==left)
				return left;
			
			int mid = (left+right)/2;
			
			if(mid<right && n[mid+1]<n[mid])
				return mid+1;
			
			if(mid>left && n[mid]<n[mid-1])
				return mid;
			
			if(n[right]>n[left])
				return recurse(n, left, mid-1);
			else
				return recurse(n, mid+1, right);
			
			
		

		

	}

}
