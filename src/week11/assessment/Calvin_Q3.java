package week11.assessment;

import org.junit.Test;

public class Calvin_Q3 {
	
	
	/*
	 * Split the string with Spaces
	 * Iterate String array reverse 
	 * Odd Elements reverse and add to String Bulilder
	 * Even elements directy add to String Builder
	 * Return string builder
	 */
	
	@Test
	public void example1() {
		
		String input = "There is no Test";
		String out = reverseAlternate (input) ;
		System.out.println(out);

	}
	
	@Test
	public void example2() {
		
		String input = "lufituaeb is amapunA";
		String out = reverseAlternate (input) ;
		System.out.println(out);

	}
	
	@Test
	public void example3() {
		
		String input = "Sooraj";
		String out = reverseAlternate (input) ;
		System.out.println(out);

	}
	
	private String reverseAlternate (String input) {
		
		String[] split = input.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		int flag = 0;
		for (int i = split.length-1; i >= 0; i--) {
			if(flag == 0) {
				StringBuilder rev = new StringBuilder();
				rev.append(split[i]);
				sb.append(rev.reverse()+" ");
				flag = 1;
			}else {
				sb.append(split[i]+" ");
				flag = 0;
			}
		}
		//System.out.println(sb.toString());
		
		return sb.substring(0, sb.length()-1);

	}

}
