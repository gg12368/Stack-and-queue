基于数组的顺序栈：
public class ArrayStack {
	private String[] items;// 数组
	private int count;// 栈中元素的个数
	private int n;// 栈的大小
	// 初始化数组，申请一个大小为n的数组空间

	public ArrayStack(int n) {
		this.items = new String[n];
		this.count = 0;
		this.count = n;
	}

	// 入栈操作
	public boolean push(String item) {
		// 数组空间不够用了直接返回false
		if (count == n) {
			return false;
		}
		// 将item下标放到count位置，并且count加1
		items[count] = item;
		count++;
		return true;
	}

	// 出栈操作
	public String pop() {
		// 栈为空，则直接返回null
		if (count == 0) {
			return null;
		}
		// 返回下标为count-1的数组元素，并且栈中元素个数count-1
		String temp = items[count - 1];
		count--;
		return temp;
	}

}
