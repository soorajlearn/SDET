package learn;

import java.util.ArrayList;

import org.junit.Test;

public class GenerateBrackets {
	
	@Test
	public void test1(){
		
		int k=3;
		System.out.println(generateBrackets(k));
		
	}
	
	
	public ArrayList<String> generateBrackets(int k){
		
		ArrayList<String> output = new ArrayList<>();
		recurse(k, output, "",0,0);
		
		return output;
		
	}
	
	
	public void recurse(int k, ArrayList<String> output, String temp, int l, int r){
		
		if(l==k && r==k){
			output.add(temp);
			return;
		}
		
		if(l<k){
			temp+='(';
			recurse(k, output, temp,l+1,r);
			temp= temp.substring(0,temp.length()-1);
		}
		if(r<l){
			temp+=')';
			recurse(k, output, temp,l,r+1);
			temp= temp.substring(0,temp.length()-1);
		}
		
		
	}

}
