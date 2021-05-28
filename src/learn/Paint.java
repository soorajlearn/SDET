package learn;

import java.math.BigInteger;
import java.util.Arrays;

import org.junit.Test;

public class Paint {

	@Test
	public void test1() {
		int[] input = { 5, 8, 2, 0, 0 };
		System.out.println(getMinPaintBalls(input));
	}

	public int getMinPaintBalls(int[] input) {

		BigInteger totSum = BigInteger.valueOf(0);

		Arrays.sort(input);

		for (int i = 0; i < input.length; i++) {
			totSum = totSum.add(BigInteger.valueOf(Integer.valueOf(input[i])));
		}

		BigInteger sum = BigInteger.valueOf(0);

		int i = 1;
		for (int j = input.length - 1; j >= 0; j--) {
			BigInteger diff = BigInteger.valueOf(0);
			sum = sum.add(BigInteger.valueOf(Integer.valueOf(input[j])));
			diff = diff.add(totSum.subtract(sum));
			if (sum.compareTo(diff) == 1) {
				break;
			}
			i++;
		}
		return i;

	}

}
