package learn;

import org.junit.Test;

public class SumuntilSingle {

	
	
	@Test
	public void test() {
		int n = 543;
		//System.out.println(getSumUntilSingle(n));
		
		
		System.out.println(recurse(n, 0));
	}

	public int getSumUntilSingle(int n) {

		int sum = 0;

		while (n >= 0) {
			sum += n % 10;
			n = n / 10;

			if (n == 0 && sum < 10) {
				return sum;
			} else if (n == 0 && sum > 10) {
				n = sum;
				sum = 0;
			}

		}
		return sum;
	}

	
	public int recurse(int n,int sum){
		
	
		if(n == 0 && sum < 10 && sum>0){
			return sum;
		}else if (n == 0 && sum > 10) {
			n = sum;
			sum = 0;
		}
		return recurse((n/10),sum+(n%10));
		
	}
}
