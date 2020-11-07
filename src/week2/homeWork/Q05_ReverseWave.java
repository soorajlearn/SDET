package week2.homeWork;

import java.util.ArrayList;

import org.junit.Test;

public class Q05_ReverseWave {
	
	@Test
	public void test1(){
		int[][] input = {{1,2,3,4},
						 {5,6,7,8},
						 {9,10,11,12},
						 {13,14,15,16}};
		reverseWave(input);
	}
	@Test
	public void test2(){
		int[][] input = {{1,2,3},
						 {5,6,7},
						 {9,10,11},
						 {13,14,15}};
		reverseWave(input);
	}
	@Test
	public void test3(){
		int[][] input = {{1,1,1},
						 {1,-1,1}
						 };
		reverseWave(input);
	}
	
	public void reverseWave(int[][] input){ //O[N][M]
		ArrayList<Integer> output = new ArrayList<>();
		int row = input.length;
		int col = input[0].length;
		
		
		while(col>0){
			if(col%2==0){//O[N]
				for (int i = 0; i < row; i++) {
					output.add(input[i][col-1]); //O[M]
				}
			}else{
				for (int i = row-1; i >=0 ; i--) {
					output.add(input[i][col-1]);
				}
			}
			col--;
		}
		
		System.out.println(output);
	}

}
