支持动态扩容的顺序栈：
public class ArrayStack2 {
	private Object[] items;// 数组
	private int count;// 栈中元素个数
	private int n;// 栈的大小
//初始化数组，申请一个大小为n的数组空间

	public ArrayStack2(int n) {
		this.items = new Object[n];
		this.count = 0;
		this.count = n;
	}

//入栈操作
	public boolean push(Object item) {
		if (count == n) {
			int oldCount = n;
			int newCount = oldCount << 1;
			// 栈大小已经超过int的最大值
			if ((newCount + 8) - Integer.MAX_VALUE > 0) {
				return false;
			}
			// 数组扩容
			n = newCount;
			// 将item放到下标为count的位置上，并且count+1
			items = Arrays.copyOf(items, newCount);
		}
		items[count] = item;
		count++;
		return true;
	}

//出栈操作
	public Object pop() {
		// 栈为空，直接返回null
		if (count == 0) {
			return null;
		}
		// 返回下标count-1的数组元素，并且栈中元素个数count-1
		Object temp = items[count - 1];
		--count;
		return temp;
	}

	public static void main(String[] args) {
		ArrayStack2 stack = new ArrayStack2(1);
		stack.push(9);
		stack.push(6);
		stack.push(8);
		System.out.println(stack.pop());
	}
}
————————————————
版权声明：本文为CSDN博主「qq_43185543」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qq_43185543/article/details/101081877
