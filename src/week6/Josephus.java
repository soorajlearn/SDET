package week6;

import java.util.Arrays;

import org.junit.Test;

public class Josephus {
	@Test
	public void test1(){
		
		int totalPeople = 13;
		//System.out.println(lastAlive(totalPeople));
		lastAlive(totalPeople);
		
	}
	
	private void lastAlive(int n){
		
		QueueImpl<Integer>  queue = new QueueImpl<>();
		
		for (int i = 1; i <=n ; i++) {
			queue.enqueue(i);
		}
		
		while(queue.size()>1){
			int temp1 = queue.get(0);			
			queue.dequeue();
			queue.enqueue(temp1);
			queue.dequeue();		
			
		}
		
		System.out.println(queue.get(0));
		
	}

}
