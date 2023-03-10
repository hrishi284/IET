package dsa.graph.array;

public class Stack {

	int [] arr;
	int top;

	public Stack() {
		arr = new int[5];
		top =-1;
	}

	public Stack(int size) {
		arr = new int[size];
		top=-1;
	}

	void push(int value)
	{
		if(top+1 < arr.length)
		{
			++top;
			arr[top] = value;
		}
		else
		{
			System.out.println("Stack Overflow! while pushing "+ value);
		}

	}

	int pop()
	{
		if(top > -1)
		{
			int value = arr[top];
			--top;
			return value;
		}
		else
		{
			System.out.println("Stack Underflow!");
			return -1;
		}
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = top; i >= 0; --i) {
			str = str + arr[i] + ", ";
		}
		return str;
	}

	public boolean isEmpty() {
		if(top == -1)
			return true;
		
		return false;
	}
}
