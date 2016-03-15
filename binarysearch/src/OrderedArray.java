/**
 * 有序数组
 * @author RongMa
 */
public class OrderedArray {
	private int[] arr; 
	private int size; //用于记录数组的有效长度,即数组中实际数据的个数
	private int maxSize; //记录数组的最大长度
	
	public OrderedArray()
	{
		size = 0;
		arr = new int[10]; //默认生成长度为10的数组
		this.maxSize = 10;
	}
	
	/**
	 * @param maxsize 数组最大长度
	 */
	public OrderedArray(int maxSize)
	{
		size = 0;
		arr = new int[maxSize];
		this.maxSize = maxSize;
	}
	
	/**
	 * 添加数据
	 * @param element 要添加的数据元素
	 */
	public void insert(int element)
	{
		if(size < maxSize)
		{
			//进行排序
			int i;
			for(i = 0 ; i < size ; i++)
			{
				if(element < arr[i]) 
				{
					break;
				}
			}
			
			for(int j = size ; j > i ; j--)
			{
				arr[j] = arr[j-1];
			}
			arr[i] = element;
			size++;
			//arr[size] = element;
			//size++;
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	/**
	 * 遍历数组中的数据
	 */
	public void show()
	{
		for(int i = 0 ; i < size ; i++)
		{
			if(i == 0)
			{
				System.out.print("["+arr[i]+",");
			}
			else if(i == size-1)
			{
				System.out.println(arr[i]+"]");
			}
			else
			{	
				System.out.print(arr[i]+",");
			}
		}
	}
	
	/**
	 * 通过索引获取数据
	 * @param index 索引
	 * @return 返回数据元素
	 */
	public int queryByIndex(int index)
	{
		if(index >= size || index < 0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			return arr[index];
		}
	}
	
	/**
	 * 根据索引值删除数据
	 * @param index 删除数据
	 */
	public void delete(int index)
	{
		if(index >= maxSize || index < 0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else 
		{
			for(int i = index ; i < size-1 ; i++)
			{
				arr[i] = arr[i+1];
			}
			size--;
		}
	}
	
	
	/**
	 * 根据数据查询（二分法，只适用于有序数组）
	 * @param value 数据
	 * @return 返回角标
	 */
	public int queryByValue(int value)
	{
		//左中右的角标
		int middle = 0;
		int left = 0;  
		int right = size -1;
		while(arr[middle] != value)
		{
			middle = (left + right) / 2;
			if(left > right)
			{
				return -1; //左侧角标比右侧大。。。没法玩
			}
			else 
			{
				if(arr[middle] > value)
				{
					//说明数据在左侧
					right = middle - 1;
				}
				else
				{
					//数据在右侧
					left = middle + 1;
				}
			}
		}
		return middle;
	}
}
