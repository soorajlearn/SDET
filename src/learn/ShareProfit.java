package learn;

import org.junit.Test;

public class ShareProfit {
	
	@Test
	public void test1(){
		int[] prices = {7,1,5,3,6,4};
		System.out.println(getMaxProfit(prices));
	}
	
	
	
	
	public int getMaxProfit(int[] prices){
		int small=prices[0], large=prices[0];
		
		for(int i=1; i<prices.length;i++){
			if(prices[i]<=small){
				small =prices[i];
				large =prices[i];
			}else{
				if(prices[i]<small){
					small=prices[i];
				}else if(prices[i]>large){
					large=prices[i];
				}
			}
		}

		return large-small;

	}

}
