package arraysort;

/**
 * 排序的工具类
 * @author RongMa
 */
public class SortUtils 
{
	private SortUtils(){}
	
	/**
	 * 冒泡排序
	 */
	public static void bubbleSort(int[] arr)
	{
		int temp;
		for(int i = arr.length-1 ; i > 0 ; i--)
		{
			for(int j = 0; j < i ; j++)
			{
				if(arr[j+1] < arr[j])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
}
