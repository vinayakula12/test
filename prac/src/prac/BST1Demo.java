package prac;



public class BST1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST1 bt= new BST1();
		bt.add(bt.root, bt.NodeCreate(4));
		bt.add(bt.root, bt.NodeCreate(3));
		bt.add(bt.root, bt.NodeCreate(1));
		bt.add(bt.root, bt.NodeCreate(2));
		bt.add(bt.root, bt.NodeCreate(6));
		bt.add(bt.root, bt.NodeCreate(5));
		bt.add(bt.root, bt.NodeCreate(7));
		bt.search(6, bt.root);
		//bt.printPreorder( bt.root);
		
		//bt.printPostorder( bt.root);
		//System.out.println(bt.height( bt.root));
		//bt.printGivenLevel(bt.root, 2);
		//bt.printInorder( bt.root);
		bt.pritnalllevel();

	}

}
