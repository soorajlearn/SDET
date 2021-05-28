package learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class GetCombinations {
	
	
	@Test
	public void test1(){
		String[] input = {"SSN", "HCID", "Intake ID", "Last Name", "First Name", "Middle Initial", "DOB", "ACN", "Status", "App type" };
		getComb(input);
	}
	public static void getComb(String[] input) {

	    List<List<String>> powerSet = new LinkedList<List<String>>();
	    
	    

	    for (int i = 1; i <= input.length; i++)
	        powerSet.addAll(combination(Arrays.asList(input), i));

	    for (List<String> list : powerSet) {
			System.out.println(list);
		}
	}

	public static <T> List<List<T>> combination(List<T> values, int size) {

	    if (0 == size) {
	        return Collections.singletonList(Collections.<T> emptyList());
	    }

	    if (values.isEmpty()) {
	        return Collections.emptyList();
	    }

	    List<List<T>> combination = new LinkedList<List<T>>();

	    T actual = values.iterator().next();

	    List<T> subSet = new LinkedList<T>(values);
	    subSet.remove(actual);

	    List<List<T>> subSetCombination = combination(subSet, size - 1);

	    for (List<T> set : subSetCombination) {
	        List<T> newSet = new LinkedList<T>(set);
	        newSet.add(0, actual);
	        combination.add(newSet);
	    }

	    combination.addAll(combination(subSet, size));

	    return combination;
	}

}
