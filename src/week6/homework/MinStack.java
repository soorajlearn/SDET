package week6.homework;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class MinStack {
	
	Stack<Integer> stack;
	
	public MinStack() {
		
		this.stack = new Stack<>();
        
    }
    
    public void push(int x) {
    	stack.push(x);
        
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
    	
    	return Collections.min(stack);
    }
    

}
