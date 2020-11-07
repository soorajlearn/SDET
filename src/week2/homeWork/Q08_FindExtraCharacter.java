package week2.homeWork;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Q08_FindExtraCharacter {
	@Test
	public void test1() {
		String input1 = "Test";
		String input2 = "Te$st";
		findExtraCharacter(input1, input2);

	}

	@Test
	public void test2() {
		String input1 = "Hello";
		String input2 = "lloleH";
		findExtraCharacter(input1, input2);

	}
	
	@Test
	public void test3() {
		String input1 = "hello";
		String input2 = "lloreH";
		findExtraCharacter(input1, input2);

	}
	
	@Test
	public void test4() {
		String input1 = "Hello";
		String input2 = "lloeH";
		findExtraCharacter(input1, input2);

	}


	private void findExtraCharacter(String input1, String input2) {

		/*
		 * char[] charArray1 = input1.toCharArray(); Arrays.sort(charArray1);
		 * 
		 * char[] charArray2 = input2.toCharArray(); Arrays.sort(charArray2);
		 * 
		 * ArrayList<Character> arr= new ArrayList<>();
		 * 
		 * if(charArray1.length>charArray2.length){ int count=0; for (int i = 0;
		 * i < charArray1.length-1; i++) { if(charArray1[i]!=charArray2[i]){
		 * arr.add(charArray1[i]); count++; }
		 * 
		 * } if(count==1){ System.out.println(arr); }else{
		 * System.out.println("Invalid Input"); } }
		 */
		int asc1 = 0, asc2 = 0;
		
		
		char[] charArray1 = input1.toCharArray(); 
		Arrays.sort(charArray1);
		String s1 = "";
		for (char c : charArray1) {
			s1 += c;
		}
		 
		 char[] charArray2 = input2.toCharArray();
		 Arrays.sort(charArray2);
		 String s2 = "";
		 
		 for (char c : charArray2) {
				s2 += c;
			}
		
		char output = '0';
		for (int i = 0; i < input1.length(); i++) {
			asc1 += (int) input1.charAt(i);
		}
		for (int i = 0; i < input2.length(); i++) {
			asc2 += (int) input2.charAt(i);
		}

		if (asc1 > asc2) {
			if ((input1.length() - input2.length() == 1)&&(s1.contains(s2))) {
				output = (char) (asc1 - asc2);
				System.out.println(output);
			} else {
				System.out.println("Invalid Input");
			}
		} else {
			if ((input2.length() - input1.length() == 1)&&(s2.contains(s1))) {
				output = (char) (asc2 - asc1);
				System.out.println(output);
			} else {
				System.out.println("Invalid Input");
			}

		}

	}

}
