package stackandquene;

public class Queue {
	private int[] arr; //数据源
	private int size; //数据源长度
	private int front; //队首指针
	private int rear; //队尾指针
	private int maxSize; //队列允许的最大长度
	
	public Queue()
	{
		arr = new int[10];
		size = 0;
		front = 0;
		rear = -1;
	}
	
	public Queue(int maxSize)
	{
		arr = new int[maxSize];
		size = 0;
		front = 0;
		rear = -1;
	}
	
	/**
	 * 判断是否为空
	 * @return
	 */
	public boolean isEmpty()
	{
		return (size == 0);
	}
	
	/**
	 * 判断队列是否满了
	 * @return
	 */
	public boolean isFull()
	{
		return (size == arr.length);
	}
	
	/**
	 * 添加数据到队列
	 * @param value 添加的数据
	 */
	public void insert(int value)
	{
		//溢出，报错
		if(isFull())
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		if(rear == arr.length-1)
		{
			rear = -1;
		}
		rear++;
		arr[rear] = value;
		size++;
	}
	
	
	/**
	 * 从队头删除数据，并将数据返回
	 * @return
	 */
	public int remove()
	{
		if(isEmpty())
		{
			throw new RuntimeException("队列为空");
		}
		int value = arr[front];
		front++;
		if(front == arr.length)
		{
			front = 0;
		}
		size--;
		return value;
	}
	
	/**
	 * 获取队头数据
	 * @return
	 */
	public int peek()
	{
		return arr[front];
	}
	
	
	
}
