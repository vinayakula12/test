package stackpr;

import java.util.Stack;

public class sorttack {
	 Stack<Integer> s1=new Stack<Integer>();
	 Stack<Integer> s2=new Stack<Integer>();
	 public void sort1(Stack<Integer>  
     s1) {
		 while(!s1.isEmpty()) {
		// s1.push(a);
		 int r=s1.pop();
		 
		 
			while(!s2.isEmpty() && s2.peek()>r) {
				s1.push(s2.pop());
			}
		 
		 s2.push(r); 
	 }
	 }
	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>(); 
        input.add(34); 
        input.add(3); 
        input.add(31); 
        input.add(98); 
        input.add(92); 
        input.add(23); 
      
        // This is the temporary stack 
        sorttack d=new sorttack();
        d.sort1(input);
        System.out.println("Sorted numbers are:");
        while (!d.s2.empty()) 
        { 
            System.out.print(d.s2.pop()+" "); 
        } 

	}

}
