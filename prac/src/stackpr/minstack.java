package stackpr;

public class minstack {
	int stackSize;
	int[] stack;
	int[] minStack;
	int top = -1, mintop = -1;

	public minstack(int size) {
		stackSize = size;
		stack = new int[size];
		minStack = new int[size];
	}
	public void push (int key) {
		top++;
		stack[top] = key;
		if(mintop == -1 || key <= minStack[mintop]) {
			mintop++;
			minStack[mintop] = key;
		}
	}
	
public int pop() throws Exception {
	if(top == -1) {
		throw new Exception("No Element");
	}
	int key = stack[top];
	top--;
	if(key == minStack[mintop]) mintop--;
	return key;
}
public int min() throws Exception {
	if(mintop == -1) {
		throw new Exception("No Element");
	}
	return minStack[mintop];
}
}
