package learn;

import org.junit.Test;

public class RemovePalindromeSubsequence {
	
	@Test
	public void test1(){
		String input = "madam";
		System.out.println(isPalindrome(input));
	}
	
	@Test
	public void test2(){
		String input = "amadam";
		System.out.println(isPalindrome(input));
	}
	
	@Test
	public void test3(){
		String input = "amadamaaa";
		System.out.println(isPalindrome(input));
	}
	
	@Test
	public void test4(){
		String input = "malayalam";
		System.out.println(isPalindrome(input));
	}
	
	@Test
	public void test5(){
		String input = "malayalamef";
		System.out.println(isPalindrome(input));
	}
	
	@Test
	public void test6(){
		String input = "turf";
		System.out.println(isPalindrome(input));
	}
	
	//public int removePalindromeSubSeq(String input){
		
	//}
	
	public boolean isPalindrome(String input){

		int start=0, end = input.length()-1;
		
		while(start<end){
			if(input.charAt(start++)!=input.charAt(end--))
				return false;
		}
		
		return true;
	}

}
