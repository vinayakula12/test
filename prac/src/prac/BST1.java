package prac;



public class BST1 {
	Node root;
	public BST1() {
		 root = null;
	 }
	public Node NodeCreate(int value){
		return new Node(value, null, null);
	}
	public void add(Node start, Node newNode) {
		if (root==null) {
			root =newNode;
		}
		else if(newNode.value>start.value) {
			if(start.right==null) {
				start.right=newNode;
			}
			add(start.right,newNode);
			
		}
		else if(newNode.value<start.value) {
			if(start.left==null) {
				start.left=newNode;
			}
			add(start.left,newNode);
			
		}
	}
		public void search(int value, Node start1) {
			if(start1==null){
				System.out.println("node isnot found");
				return;
			}
			if(start1.value==value)
			{
				System.out.println("node is found");
				//return;
			}
			if(value>start1.value) {
				search(value,start1.right);
			}
			if(value<start1.value) {
				search(value,start1.left);
			}
		}
		void printPreorder(Node node) {
			if (node==null) {
				return;
			}
			System.out.println(node.value);
			printPreorder(node.left);
			printPreorder(node.right);
			
			
		}
		void printPostorder(Node node) {
			if (node==null) {
				return;
			}
			
			printPostorder(node.left);
			printPostorder(node.right);
			System.out.println(node.value);
			
			
		}
		void printInorder(Node node) {
			if (node==null) {
				return;
			}
			
			printInorder(node.left);
			System.out.println(node.value);
			printInorder(node.right);
			
			
			
		}
		int height(Node root) {
			if (root== null) {
			return 0;
			
		}
			int hl=height(root.left);
			int hr=height(root.right);
			if (hl>hr) {
				return(hl+1);
			}
			else {
				return(hr+1);
			}
	}
		 void printGivenLevel (Node root ,int level) {
			 if (root== null) {
					return;
					
				}
			 else if (level== 1) {
					System.out.println(root.value);
					
				}
			 else {
				 printGivenLevel(root.left,level-1);
				 printGivenLevel(root.right,level-1);
			 }
			 
			 
			 
		 }
		 void pritnalllevel() {
			int h= height(root);
			 for (int i=1;i<h+1;i++) {
				 printGivenLevel(root,i);
				 
			 }
		 }
}


