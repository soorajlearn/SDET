package week16;

import org.junit.Test;

public class KnockOut {

	/*
	 * 1 team - no match 2 teams - 1 match 3 teams - 2 matches 4 teams - 3
	 * matches 5 teams - 4 matches 6 teams - 5 matches
	 */

	@Test
	public void test1() {
		int noOfTeams = 10;
		System.out.println(findNoOfKnockoutMatches(noOfTeams));
	}

	int numberOfMatches = 0;
	private int findNoOfKnockoutMatches(int noOfTeams) {

		
		
		recurse(noOfTeams);
		return numberOfMatches;
	}

	private void recurse(int n) {
		if (n >= 2) {

			if (n > 1 && (n % 2) != 0) {
				n=(n - 1) / 2;
				numberOfMatches += n;
				recurse(n+1);
			} else if (n > 1 && (n % 2) == 0) {
				n=(n) / 2;
				numberOfMatches += n ;
				recurse(n);
			}
		}
	}

}
