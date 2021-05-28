package week14;

import org.junit.Test;

public class PatternBasedSort {
	
	/*Sort based on another String
Given one string ('abbceeeg') sort it based on another string ('egbca')
Result will be: 'eeegbbca'
Do it less O[N2] => O[nlogn] => O[N]
String s1 ="abbceeeg";
String s2 = "egbca";
Lowercase Alphabets
No built sort functions !!*/
	
	/*
	 * 1. Iterate thru second string by converting into characters 
	 * 2. get the first index and last index of character in sorted string 1 and append it to the output */
	@Test
	public void test1(){
		String s1 = "abbceeeg";
		String s2 = "egbca";
		System.out.println(patternBasedSort(s1, s2));
	}
	
	public String patternBasedSort(String s1, String s2){
		
		/*char[] charArray = s1.toCharArray();
		
		for(int i = 0; i < charArray.length; i++)
	      {
	         for(int j = i + 1; j < charArray.length; j++)
	         {
	            if(charArray[i]> charArray[j])
	            {
	               Character temp = s1.charAt(i);
	               charArray[i]=charArray[j];
	               charArray[j]=temp;
	            }
	         }
	      }*/
		
		StringBuilder sb = new StringBuilder();
		
		
		for (Character c : s2.toCharArray()) {
			sb.append(s1.substring(s1.indexOf(c), s1.lastIndexOf(c)+1));
		}
		
		return sb.toString();
	}

	
	public void patternBasedSort1(String s1, String s2){
		//solve using map
	}
}
