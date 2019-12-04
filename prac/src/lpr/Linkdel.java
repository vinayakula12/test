package lpr;

import java.util.HashSet;

public class Linkdel {
	Node head;
	public Linkdel() {
		 head= null;
		}
	public void add(int value) {
		Node ne1=new Node(value,null); 
		if(head==null) {
			head=ne1;
		}
		else{
			ne1.next=head;
			head=ne1;
		}
	}
	public void delete() {
		head=head.next;
	}
	public void display(Node g) {
		Node n=g;
		
	while(n!=null) {
		System.out.println(n.value);
		n=n.next;
	}
	
	}
	public Node reverse1(Node h) {
	
		if (h==null) {
			return h;
		}
		else if(h.next==null) {
			return h;
		}
		else  {
			Node newno=h.next;
			h.next=null;
			Node rest=reverse1(newno);
			newno.next=h;
			return rest;
		}
		
		
	}
	public Node reverseit() {
		Node h=head;
		Node ptr1=null;
		Node ptr2=null;
		while(h!=null) {
		ptr1=h.next;
		h.next=ptr2;
		ptr2=h;
		h=ptr1;
		
		}
		return ptr2;
		
		
		
	}
	void printNthFromLast(int k) {
		int count = 0;
		Node ptrr=head;
		Node ptra=head;
		while(count<k) {
			
			ptrr=ptrr.next;
			count++;
		}
		while(ptrr!=null) {
			
			ptra=ptra.next;
			ptrr=ptrr.next;
			
		}
		System.out.println("the value is"+ptra.value);
		
		
	}
	 public void removeDuplicate(Node head) {
		 Node j=head;
		 int h = 0;
		Node prev = null; 
		 HashSet<Integer> hs = new HashSet<>(); 
		 while(j!=null) {
			 h=j.value;
			 if(hs.contains(h)) {
				 //j=j.next;
				 prev.next = j.next;
			 }
			 else {
				 hs.add(h);
				 prev=j;
			 }
			 j=j.next;
		 }
		//return j;
	 }

}
