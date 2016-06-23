
public class ListNode {
	ListNode next;
	int val;
	
	public ListNode(int num) 
	{
		num = val;
	}
	
	public static String show(ListNode list)
	{
		ListNode point = list;
		String text = "";
		while(point != null)
		{
			text = text+point.val+"->";
			point = point.next;
		}
		return text;
	}
}
