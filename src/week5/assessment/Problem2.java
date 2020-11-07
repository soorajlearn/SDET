package week5.assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Problem2 {
	@Test
	public void test1() {
		List<Integer> scheduleStart = new ArrayList<>();
		List<Integer> scheduleEnd = new ArrayList<>();

		scheduleStart.add(6);
		scheduleStart.add(1);
		scheduleStart.add(2);
		scheduleStart.add(3);

		scheduleEnd.add(8);
		scheduleEnd.add(9);
		scheduleEnd.add(4);
		scheduleEnd.add(7);

		/*
		 * 6 1 2 3 8 9 4 7 2 1
		 */

		System.out.println(maxPresentations(scheduleStart, scheduleEnd));

	}

	@Test
	public void test2() {
		List<Integer> scheduleStart = new ArrayList<>();
		List<Integer> scheduleEnd = new ArrayList<>();

		scheduleStart.add(1);
		scheduleStart.add(1);
		scheduleStart.add(2);
		scheduleStart.add(3);

		scheduleEnd.add(2);
		scheduleEnd.add(3);
		scheduleEnd.add(3);
		scheduleEnd.add(4);

		/*
		 * 6 1 2 3 8 9 4 7 2 1
		 */

		System.out.println(maxPresentations(scheduleStart, scheduleEnd));

	}

	@Test
	public void test3() {
		List<Integer> scheduleStart = new ArrayList<>();
		List<Integer> scheduleEnd = new ArrayList<>();

		scheduleStart.add(1);
		scheduleStart.add(1);
		scheduleStart.add(2);

		scheduleEnd.add(3);
		scheduleEnd.add(2);
		scheduleEnd.add(4);

		/*
		 * 6 1 2 3 8 9 4 7 2 1
		 */

		System.out.println(maxPresentations(scheduleStart, scheduleEnd));

	}

	public int maxPresentations(List<Integer> scheduleStart, List<Integer> scheduleEnd) {
		List<Integer> maxPre = new ArrayList<Integer>();
		for (int i = 0; i < scheduleEnd.size(); i++) {
			int counter = 0;
			for (int j = 0; j < scheduleEnd.size(); j++) {
				if (j != i) {
					if (scheduleStart.get(i) >= scheduleStart.get(j) && scheduleStart.get(i) >= scheduleEnd.get(j)) {

						if (scheduleEnd.get(i) >= scheduleStart.get(j) && scheduleEnd.get(i) >= scheduleEnd.get(j))
							counter++;
					} else if (scheduleStart.get(i) <= scheduleStart.get(j)
							&& scheduleStart.get(i) <= scheduleEnd.get(j)) {

						if (scheduleEnd.get(i) <= scheduleStart.get(j) && scheduleEnd.get(i) <= scheduleEnd.get(j))
							counter++;

					}
				}
			}
			maxPre.add(counter + 1);
		}
		return Collections.max(maxPre);
	}
}
