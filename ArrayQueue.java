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
			System.out.println("队列已满");
			throw new ArrayIndexOutOfBoundsException();
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
