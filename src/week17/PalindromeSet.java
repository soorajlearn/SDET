package week17;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PalindromeSet {
	
	@Test
	public void example1(){
		String[] input ={"bat" , "ball", "tab"};
		System.out.println(palindromeSet(input));
	}
	@Test
	public void example2(){
		String[] input ={"bat" , "ball", "abt"}; 
		System.out.println(palindromeSet(input));
	}
	@Test
	public void example3(){
		String[] input ={"madam" , "", "madam"}; 
		System.out.println(palindromeSet(input));
	}
	@Test
	public void example4(){
		String[] input ={"madam" , "", "mad"}; 
		System.out.println(palindromeSet(input));
	}
	@Test
	public void example5(){
		String[] input ={"madam"}; 
		System.out.println(palindromeSet(input));
	}
	
	//>O[N]^2
	/* 1. 2 pointer to determine palindrome - IsPalindrome
	 * 2. Use 2 for loops and when i!=j , concatenate and check the concatenated string is palindrome or not 
	 * 3. if yes add i,j in output list
	 * */
	
	public ArrayList<ArrayList<Integer>> palindromeSet(String[] input){
		ArrayList<ArrayList<Integer>> output = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {	
			for (int j = 0; j < input.length; j++) {
				if(i!=j && isPalindrome(input[i]+input[j])){	
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(i);
					list.add(j);
					output.add(list);
				}
			}			
		}
		return output;	
	}
	
	
	public boolean isPalindrome(String str){
		int start=0, end = str.length()-1;
		while(start<=end){
			if(str.charAt(start)!=str.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
