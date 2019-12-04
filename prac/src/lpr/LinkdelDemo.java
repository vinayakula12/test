package lpr;

public class LinkdelDemo {

	public static void main(String[] args) {
		Linkdel ls= new 	Linkdel();
		ls.add(1);
		//ls.add(3);
		ls.add(5);
		ls.add(5);
		ls.add(7);
		System.out.println("before delete");
		ls.display(ls.head);
		System.out.println("after delete");
	//ls.delete();
		// ls.display();
		 
		//Node r=ls.reverse1(ls.head);
		//Node r=ls.reverseit();
		//ls.display(r);
		ls.removeDuplicate(ls.head);
		ls.display(ls.head);

	}

}
