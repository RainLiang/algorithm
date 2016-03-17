package arraysort;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
import sun.tools.jar.resources.jar;

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
	
	/**
	 * 选择排序
	 * @param arr 要进行排序的数组
	 */
	public static void selectionSort(int[] arr)
	{
		int temp = 0;
		for(int i = 0 ; i < arr.length-1 ; i++)
		{
			int minIndex = i;
			for(int j = i+1 ; j < arr.length ; j++)
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			if(minIndex != i)
			{
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	
	/**
	 * 插入排序
	 * @param arr
	 */
	public static void insertSort(int[] arr)
	{
		for(int i = 1; i < arr.length ; i++)
		{
			int temp = arr[i];
			int j = i;
			while(j >= 1 && arr[j-1] > temp)
			{
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	
	
	
	
	
}
