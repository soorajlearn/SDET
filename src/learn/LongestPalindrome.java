package learn;

import org.junit.Test;

public class LongestPalindrome {
	
	@Test
	public void test1(){		
		String s= "babad";
		System.out.println(getLongestPalindrome(s));	
	}
	
	@Test
	public void test2(){		
		String s= "abcd";
		System.out.println(getLongestPalindrome(s));	
	}
	
	@Test
	public void test3(){		
		String s= "bbb";
		System.out.println(getLongestPalindrome(s));	
	}
	
	@Test
	public void test4(){		
		String s= "malayalammadam";
		System.out.println(getLongestPalindrome(s));	
	}
	
	
	
	public String getLongestPalindrome(String s){
		
		int max = Integer.MIN_VALUE;
		int l=0, r=0;
		String output="";
		
		for(int i=0; i<s.length()*2; i++){
			int start =i/2, end=start+(i%2);
			while((start>=0 && end<s.length()) && (s.charAt(start) == s.charAt(end))){
			  start--;
			  end++;
			}
			if(end-start+1>max){
			 max = end-start+1;
			 output = s.substring(start+1,end);
			}
		}
		
		return output;
}

}
