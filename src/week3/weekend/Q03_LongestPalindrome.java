package week3.weekend;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Q03_LongestPalindrome {
	
	
	
	@Test
	public void dataSetOne()
	{
		String input="malayalammadam";
		System.out.println("One:"+findPlaindromeCount(input));
	}
	@Test
	public void dataSetTwo()
	{
		String input="effeeee";
		System.out.println("Two:"+findPlaindromeCount(input));
	}
	@Test
	public void dataSetThree()
	{
		String input="bbbbbbaaaaaaafffff";
		System.out.println("Three:"+findPlaindromeCount(input));
	}
	
	@Test
	public void dataSetFour()
	{
		String input="unique";
		System.out.println("Four:"+findPlaindromeCount(input));
	}
	
	private int findPlaindromeCount(String input)
	{
		Map<Character,Integer>count=new HashMap<>();
		for(int i=0;i<input.length();i++)
		{
			count.put(input.charAt(i), count.getOrDefault(input.charAt(i), 0)+1);
		}
		int maxOdd=0;int maxLength=0;
		int countOdd=0;
		for (Character i : count.keySet())
		{
			Integer current = count.get(i);
			if(current%2==0)
			{
				maxLength=maxLength+current;
			}
			else
			{
				if(current%2 == 1){
					countOdd++;
				}
				
					maxOdd=maxOdd+current;
					countOdd++;
				
			}
		}
		if(countOdd==1){
			maxLength=maxLength+maxOdd;
		}else{
			maxLength=maxLength+maxOdd-countOdd;
		}
		return maxLength;
		
	}

}
