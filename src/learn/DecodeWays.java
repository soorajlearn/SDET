package learn;

import org.junit.Test;

public class DecodeWays {
	
	@Test
	public void test1(){
		System.out.println(numDecodings("10"));
	}
	
	
    public int numDecodings(String s) {
        
        int n = s.length();
        if(s.charAt(0)=='0'){
            return 0;
        }
        
        int[] da = new int[n+1];
        da[0]=1;
        da[1]=1;
        
        for(int i=1; i<n; i++){
            if(s.charAt(i)!='0'){
                da[i+1] += da[i];
            }
            int twoString = Integer.parseInt(s.substring(i-1,i+1));
            
            if(twoString >=10 && twoString <=26){
                da[i+1] += da[i-1];
            }
            
        }
        
        return da[n];
        
    }

}
