package week1;
import org.junit.Test;

public class RemoveVowels {
	@Test
	public void test1(){
		String s = "sooraj";
		removeVowels(s);
	}

	private void removeVowels(String input){
		String regex = "[aeiouAEIOU]";
		
		input = input.replaceAll(regex, "");
		
		System.out.println(input);
		
		
	}
}
