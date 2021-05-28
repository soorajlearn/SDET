package week16;

import org.junit.Test;

public class PascalTriangle {
	
	@Test
	public void test1(){
		int n = 5;
		pascal(n);
	}
	
	
	public void pascal(int n){
		for (int i = 0; i < n; i++) {
			System.out.println();
			recursion(i);
		}
	}
	
	public void recursion(int row){
		
		for (int i = 0; i < row; i++) {
			if(i==0 || i==row){
				System.out.print(1);
			}
			else{
				
			}
		}
		
	}

}
