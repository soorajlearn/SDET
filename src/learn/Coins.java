package learn;

import java.util.Arrays;

import org.junit.Test;

public class Coins {
	@Test
	public void test1() {
		int[] coins = { 5, 4, 2 };
		int amount = 16;
		System.out.println(getMinCoins(coins, amount));
	}

	public int getMinCoins(int[] coins, int amount) {

		int sum = 0;

		Arrays.sort(coins);

		for (int i = coins.length - 1; i >= 0; i--) {

			sum += amount / coins[i];
			amount = amount % coins[i];

		}

		if (amount != 0) {
			return -1;
		}

		return sum;

	}

}
