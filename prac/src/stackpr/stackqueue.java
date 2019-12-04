package stackpr;

import java.util.Stack;

public class stackqueue {
	 Stack<Integer> s1=new Stack<Integer>();
	 Stack<Integer> s2=new Stack<Integer>();
	 public void queue(int a) {
		 s1.push(a);
	 }
	 
	 public int dqueue() {
		 if(s2.isEmpty()) {
			 while(!s1.isEmpty()) {
				 s2.push(s1.pop());
			 }
		 }
		int y= s2.pop();
		return y;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackqueue q = new stackqueue(); 
        
        q.queue(1);
        q.queue(2);
        q.queue(3);
        q.queue(4);
        q.queue(5);
        q.dqueue();
        q.dqueue();
        
  
        /* Dequeue items */
        System.out.print(q.dqueue() + " "); 
        System.out.print(q.dqueue() + " "); 
        System.out.println(q.dqueue() + " "); 

	}

}
