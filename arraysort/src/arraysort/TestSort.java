package arraysort;

/**
 * 排序的测试类
 * @author RongMa
 */
public class TestSort 
{
	public static void main(String[] args) {
		int[] arr = {22,66,88,99,55,11,33,44,77,111,98};
		SortUtils.bubbleSort(arr);
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
	}
}
