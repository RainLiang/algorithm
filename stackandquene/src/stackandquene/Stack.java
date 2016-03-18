package stackandquene;

/**
 * @author RongMa
 *
 */
public class Stack 
{
	private int[] arr; //数据源
	private int top = -1; //栈顶的位置

	public Stack()
	{
		arr = new int[10];
	}
	
	public Stack(int length)
	{
		arr = new int[length];
	}
	
	/**
	 * 向栈顶添加数据
	 * @param value 添加的数据
	 */
	public void push(int value)
	{
		if(!isFull())
		{
			top++;
			arr[top] = value;
		}
		else
		{
			throw new RuntimeException("栈内存已经满了，不要再添加数据！");
		}
	}
	
	/**
	 * 获取栈顶的数据，并将栈顶的数据删除
	 * @return 返回数据
	 */
	public int pop()
	{
		if(!isEmpty())
		{
			return arr[top--];	
		}
		else
		{
			throw new NullPointerException("栈内不存在数据");
		}
	}
	
	/**
	 * 获取栈顶的数据
	 * @return
	 */
	public int peek()
	{
		if(!isEmpty())
		{
			return arr[top];
		}
		else
		{
			throw new NullPointerException("栈内不存在数据");
		}
	}
	
	/**
	 * 判断是否为空栈
	 * @return
	 */
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	/**
	 * 判断栈内存是否已经满了
	 * @return
	 */
	public boolean isFull()
	{
		return (top == arr.length-1);
	}
}
