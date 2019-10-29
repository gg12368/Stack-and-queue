基于链表的链式栈：
public class StackBasedLinkedList {
	private static class Node {
		private int data;
		private Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node top = null;

//入栈
	public void push(int value) {
		Node newNode = new Node(value, null);
		// 判断栈是否空
		if (top == null) {
			top = newNode;
		}
		newNode.next = top;
		top = newNode;
	}

//出栈，用-1表示栈中没有数据
	public int pop() {
		if (top == null) {
			return -1;
		}
		int value = top.data;
		top = top.next;
		return value;
	}
	//打印
	public void printAll() {
		Node p=top;
		while(p!=null) {
			System.out.println(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}
}
