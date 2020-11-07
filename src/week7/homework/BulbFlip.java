package week7.homework;

import org.junit.Test;

public class BulbFlip {

	@Test
	public void test1() {
		String target = "001011100";
		System.out.println(minFlips(target));
	}

	public int minFlips(String target) {
		String input = "";
		for (int i = 0; i < target.length(); i++) {
			input += 0;
		}

		int count = 0;
		int iPos = target.indexOf('1');

		if (iPos == -1) {
			return 0;
		} else {
			char ch = '1';
			for (int i = iPos; i < target.length(); i++) {

				if (target.charAt(i) ==ch) {
					input = flip(i, input);
					count++;
					if (target.charAt(i) == '1')
						ch = '0';
					else
						ch = '1';

				}

			}
            
		}
		return count;
	}

	public String flip(int pos, String input) {

		String out = input.substring(0, pos);
		for (int i = pos; i < input.length(); i++) {
			if (input.charAt(i) == 1) {
				out += 0;
			} else {
				out += 1;
			}
		}
		return out;
	}

}
