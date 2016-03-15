//测试类
public class testBinarySearch {
	public static void main(String[] args) {
		OrderedArray orderedArray = new OrderedArray();
		insertNumbers(orderedArray);
		orderedArray.show();
		orderedArray.delete(5);
		orderedArray.show();
		System.out.println("元素46在第"+orderedArray.queryByValue(46)+"位置");
		
	}
	
	private static void insertNumbers(OrderedArray orderedArray) 
	{
		orderedArray.insert(34);
		orderedArray.insert(45);
		orderedArray.insert(11);
		orderedArray.insert(15);
		orderedArray.insert(23);
		orderedArray.insert(38);
		orderedArray.insert(46);
		orderedArray.insert(57);
		orderedArray.insert(22);
		orderedArray.insert(33);
	}
}
