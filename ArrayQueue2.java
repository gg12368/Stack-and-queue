public class ArrayQueue<T> implements Queue<T> {
//存放具体数据
	private T[] elementData;
	// 队列头
	private int head;
	// 队列尾部
	private int tail;
	// 队列容量
	private int capacity;

	public ArrayQueue(int capacity) {
		this.capacity = (T[]) new Object[capacity];
	}

	// 元素入队
	public void enqueue(T t) {
	if (tail == capacity) {
		// tail == capacity && head == 0 表示队列已满
		if (head == 0) {
			System.err.println("队列已满");
			throw new ArrayIndexOutOfBoundsException();
 		}
		else {
			// 数据搬移
			for (int i = head;i < tail;i++) {
				elementData[i - head] = elementData[i];
 			}
			// 数据搬移后更新两个指针位置
			tail -= head;
			head = 0;
		 }
	 }
	elementData[tail++] = t;
 }
	// 元素出队
	public T dequeue() {
		if (head == tail) {
			System.out.println("队列为空");
			throw new NullPointerException();
		}
		T result = elementData[head++];
		return result;
	}

	// 返回队首元素，但不出队
	public T peek() {
		if (head == tail) {
			System.out.println("队列为空");
			throw new NullPointerException();
		}
		T result = elementData[head];
		return result;
	}

	public int getSize() {
		return tail - head;
	}

	public boolean isEmpty() {
		return head == tail;
	}
}
