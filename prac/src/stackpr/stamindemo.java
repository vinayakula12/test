package stackpr;

public class stamindemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		minstack ms = new minstack(100);
		
			ms.push(1); 
			System.out.println("The minimun element is: " + ms.min());
			ms.push(0);
			ms.push(1);
			System.out.println("The poped element is: " + ms.pop());
			System.out.println("The minimun element is: " + ms.min());
			System.out.println("The poped element is: " + ms.pop());
			System.out.println("The minimun element is: " + ms.min());
	}

}
