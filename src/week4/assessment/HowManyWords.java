package week4.assessment;

import org.junit.Test;

public class HowManyWords {
	@Test
	public void test1(){
		String s= "How many eggs are in a half-dozen, 13?";
		howManyWords(s);
	}
	
	public void howManyWords(String s){
		
		//String stringWithNoSpec = s.replaceAll("[^-0-9A-Za-z\\s]", "");
		System.out.println(s);
		
		String[] split = s.split(" ");
		
		int countOfWords = 0;
		for (String string : split) {
			
			int count=0;
			for (int i = 0; i < string.length(); i++) {
				if(((int)string.charAt(i)<=48 && (int)string.charAt(i)>=57) || (int)string.charAt(i)==45 ||((int)string.charAt(i)>=65  && (int)string.charAt(i)<= 90)  || ((int)string.charAt(i)>=97  && (int)string.charAt(i)<= 122)){
				
				
				count+=1;
				}
				
				
				
			}
			if(string.charAt(string.length()-1)=='!' ||
					string.charAt(string.length()-1)=='?' ||
					string.charAt(string.length()-1)==',' ||
					string.charAt(string.length()-1)=='.' ){
				count = count-1;
				
			}
			if(count==string.length()){
				countOfWords +=1;
			}
			
		}
		System.out.println(countOfWords);
		
	}
	
	
	public void howMany2(String s){
		
		String replaceAll = s.replaceAll("[^-0-9A-Za-z\\s]", "");
		System.out.println(replaceAll);
		
		
		
	}

}
