package week1;
import java.util.Arrays;

import org.junit.Test;

public class StringReverse {
	@Test
	public void test1() {
		String s = "Sooraj";
		revString(s);
		revString2(s);
		reverseString(s);
		reverseStringUsing2Pointer(s);
	}

	private void revString(String input) {
		char[] charArray = input.toCharArray();
		String output = "";

		for (int i = charArray.length - 1; i >= 0; i--) {

			output += charArray[i];

		}
		System.out.println(output);
	}

	private void revString2(String input) {
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			output += input.charAt(i);

		}
		System.out.println(output);
	}
	
	public void reverseString(String input) {
        StringBuilder sb=new StringBuilder();
        
        sb.append(input);
        
        System.out.println(sb.reverse());
    }
	
	public void reverseStringUsing2Pointer(String input) {
		char[] charArray = input.toCharArray();
		int left =0 ;
		int right = charArray.length-1;
		while(left<right){
			char temp = charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(charArray));
    }

}
